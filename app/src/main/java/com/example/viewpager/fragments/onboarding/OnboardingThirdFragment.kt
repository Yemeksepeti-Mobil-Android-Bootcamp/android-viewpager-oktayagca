package com.example.viewpager.fragments.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.viewpager.R
import com.example.viewpager.databinding.FragmentOnboardingThirdBinding


class OnboardingThirdFragment:Fragment() {
    private lateinit var binding: FragmentOnboardingThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingThirdBinding.inflate(layoutInflater,container,false)
        val view = binding.root
       initViews()
        return view
    }

    private fun initViews() {
        binding.homeButton.setOnClickListener(){
            findNavController().navigate(R.id.action_onboardingFragment_to_homeFragment)
        }
    }
}