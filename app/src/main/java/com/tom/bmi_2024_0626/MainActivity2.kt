package com.tom.bmi_2024_0626

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tom.bmi_2024_0626.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        R.id.hello_main
//        R.drawable.pig
//        R.string.ok
//        R.color.messageColor



    }

}