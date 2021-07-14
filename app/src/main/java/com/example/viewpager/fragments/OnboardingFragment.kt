package com.example.viewpager.fragments
import DepthPageTransformer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.viewpager.databinding.FragmentOnboardingBinding
import com.example.viewpager.utils.ViewPagerAdapter

class OnboardingFragment: Fragment() {
    private lateinit var binding: FragmentOnboardingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        initViewPager()
        return view

    }


    private fun initViewPager() {
        val adapter = ViewPagerAdapter(requireActivity())
        binding.viewPager.adapter = adapter
        binding.viewPager.setPageTransformer(DepthPageTransformer())
        binding.dotsIndicator.setViewPager2(binding.viewPager)
    }
}