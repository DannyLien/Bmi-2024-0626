package com.tom.bmi_2024_0626

import android.app.GameState
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tom.bmi_2024_0626.databinding.ActivityMain2Binding
import com.tom.bmi_2024_0626.vending.GameStatus
import com.tom.bmi_2024_0626.vending.GuessViewModel

class MainActivity2 : AppCompatActivity() {
    private val NICKNAME_REQ: Int = 11
    private lateinit var viewModel: GuessViewModel
    private val TAG = MainActivity2::class.java.simpleName
    private lateinit var binding: ActivityMain2Binding
    val game = GuessGame()
    val requestNickname =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->

            val nickname = getSharedPreferences("guess", MODE_PRIVATE)
                .getString("nickname", null)
            Log.d(TAG, "Data : ${nickname}")

            if (result.resultCode == RESULT_OK) {
                val nickname = result.data?.getStringExtra("NICK")
                Log.d(TAG, "Result : ${nickname}")
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate: ")

        viewModel = ViewModelProvider(this).get(GuessViewModel::class.java)
        viewModel.counter.observe(this) { counter ->
            binding.counter.text = counter.toString()
        }
        viewModel.status.observe(this) { status ->
            val message = when (status) {
                GameStatus.BIGGER -> getString(R.string.bigger)
                GameStatus.SMALLER -> getString(R.string.smaller)
                GameStatus.INIT -> ""
                else -> getString(R.string.you_got_it)
            }
            if (status != GameStatus.INIT) {
                AlertDialog.Builder(this)
                    .setTitle(getString(R.string.info))
                    .setMessage(message)
                    .setPositiveButton(R.string.ok, null)
                    .setNegativeButton("Replay") { dialog, which ->
                        Log.d(TAG, "Replay")
                        viewModel.reset()
                        binding.number.text.clear()
                    }
                    .show()
            }
        }
        viewModel.secretData.observe(this) { secret ->
            Toast.makeText(this, "secret:${secret}", Toast.LENGTH_LONG).show()
        }

    }

    fun guess(view: View) {
        viewModel.guess(binding.number.text.toString().toInt())
    }

    fun setNickName(view: View) {
        val intent = Intent(this, NicknameActivity::class.java)
        intent.putExtra("EXTRA_LEVEL", 3)
        intent.putExtra("NAME", "Hank")
        requestNickname.launch(intent)

        Intent(this, NicknameActivity::class.java).apply {
            putExtra("A", "ABC")
            putExtra("B", "Testing")
        }.also {
            requestNickname.launch(it)
        }

    }

    //    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        Log.d(TAG, "requestCode: ${requestCode}")
//        if (requestCode == NICKNAME_REQ) {
//            Log.d(TAG, "onActivityResult: ${resultCode}")
//            val nickname = data?.getStringExtra("NICK")
//            Log.d(TAG, "onActivityResult: ${nickname}")
//            Toast.makeText(this, "nickname : ${nickname}", Toast.LENGTH_LONG).show()
//        }
//
//    }


    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

}