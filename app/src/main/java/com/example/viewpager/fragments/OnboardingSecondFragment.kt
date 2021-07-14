package com.example.viewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager.databinding.FragmentOnboardingSecondBinding

class OnboardingSecondFragment:Fragment() {
    private  lateinit var binding:FragmentOnboardingSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingSecondBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        return view
    }
}