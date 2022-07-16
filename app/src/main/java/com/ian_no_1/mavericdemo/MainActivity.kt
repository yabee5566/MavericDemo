package com.ian_no_1.mavericdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ian_no_1.mavericdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }




}