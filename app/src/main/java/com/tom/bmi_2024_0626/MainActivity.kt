package com.tom.bmi_2024_0626

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tom.bmi_2024_0626.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myInfo.text = "Hello Danny !!!!!"

    }
}