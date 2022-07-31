package com.ian_no_1.mavericdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ian_no_1.mavericdemo.databinding.ActivityMainBinding
import com.ian_no_1.mavericdemo.ui.HahaMonsterFragment

class MainActivity : AppCompatActivity() {


    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val hahaMonsterFragment: HahaMonsterFragment by lazy(LazyThreadSafetyMode.NONE) {
        HahaMonsterFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.homeFragmentContainer, hahaMonsterFragment)
            .commit()
    }
}