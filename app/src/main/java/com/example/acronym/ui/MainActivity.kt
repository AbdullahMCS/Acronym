package com.example.acronym.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.acronym.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val acronymViewModel: AcronymViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        _binding?.apply {
            lifecycleOwner = this@MainActivity
            acronymViewModel = this@MainActivity.acronymViewModel
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}