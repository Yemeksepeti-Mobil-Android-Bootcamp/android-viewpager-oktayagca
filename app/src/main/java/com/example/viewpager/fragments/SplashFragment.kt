package com.example.viewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.viewpager.R
import com.example.viewpager.databinding.FragmentSplashBinding

class SplashFragment: Fragment() {
    private lateinit var binding:FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        binding.next.setOnClickListener(){
            findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
        }
        return view
    }
}