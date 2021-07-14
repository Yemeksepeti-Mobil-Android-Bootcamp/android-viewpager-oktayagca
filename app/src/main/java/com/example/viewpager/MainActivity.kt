package com.example.viewpager

import DepthPageTransformer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.databinding.ActivityMainBinding
import com.example.viewpager.utils.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


}