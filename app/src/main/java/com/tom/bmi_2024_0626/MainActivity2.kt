package com.tom.bmi_2024_0626

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.tom.bmi_2024_0626.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val TAG = MainActivity2::class.java.simpleName
    private lateinit var binding: ActivityMain2Binding
    val secret = (1..10).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this, "secret:${secret}", Toast.LENGTH_LONG).show()
    }

    fun guess(view: View) {
        if (!binding.number.text.toString().equals("")) {
            val num = binding.number.text.toString().toInt()
            Log.d(TAG, "guess: ${num.toString()}")
            val message = if (num > secret) {
                getString(R.string.smaller)
            }else if(num < secret){
                getString(R.string.bigger)
            }else{
                getString(R.string.you_got_it)
            }
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.info))
                .setMessage(message)
                .setPositiveButton(R.string.ok, null)
                .show()
        } else {
            Toast.makeText(this, getString(R.string.please_enter_a_number_1_10), Toast.LENGTH_SHORT).show()
        }
    }

}