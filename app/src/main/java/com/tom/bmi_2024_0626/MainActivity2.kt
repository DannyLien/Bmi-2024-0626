package com.tom.bmi_2024_0626

import android.app.GameState
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tom.bmi_2024_0626.databinding.ActivityMain2Binding
import com.tom.bmi_2024_0626.vending.GameStatus
import com.tom.bmi_2024_0626.vending.GuessViewModel

class MainActivity2 : AppCompatActivity() {
    private lateinit var viewModel: GuessViewModel
    private val TAG = MainActivity2::class.java.simpleName
    private lateinit var binding: ActivityMain2Binding
    val game = GuessGame()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

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
//        if (!binding.number.text.toString().equals("")) {
//            val num = binding.number.text.toString().toInt()
//            val message = when (game.guess(num)) {
//                GuessGame.Status.SMALLER -> getString(R.string.smaller)
//                GuessGame.Status.BIGGER -> getString(R.string.bigger)
//                else -> getString(R.string.you_got_it)
//            }
//            binding.counter.text = game.counter.toString()
//            val okLisener = object : DialogInterface.OnClickListener {
//                override fun onClick(p0: DialogInterface?, p1: Int) {
//                    TODO("Not yet implemented")
//                }
//            }
//            AlertDialog.Builder(this)
//                .setTitle(getString(R.string.info))
//                .setMessage(message)
//                .setPositiveButton(R.string.ok, null)
//                .setNegativeButton("Replay", { dialog, which ->
//                    Log.d(TAG, "Replay")
//                    game.reset()
//                    binding.counter.text = game.counter.toString()
//                })
//                .show()
//        } else {
//            Toast.makeText(this, getString(R.string.please_enter_a_number_1_10), Toast.LENGTH_SHORT)
//                .show()
//        }
    }

}