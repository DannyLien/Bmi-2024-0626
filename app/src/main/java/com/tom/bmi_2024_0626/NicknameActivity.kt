package com.tom.bmi_2024_0626

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tom.bmi_2024_0626.databinding.ActivityNicknameBinding

class NicknameActivity : AppCompatActivity() {
    private val TAG: String? = NicknameActivity::class.java.toString()
    private lateinit var binding: ActivityNicknameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNicknameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val level = intent.getIntExtra("EXTRA_LEVEL", 0)
        val name = intent.getStringExtra("NAME")
        Log.d(TAG, "onCreate: $level, $name")

    }
}