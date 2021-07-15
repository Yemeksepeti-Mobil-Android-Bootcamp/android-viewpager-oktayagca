package com.example.viewpager.utils
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.fragments.onboarding.OnboardingFirstFragment
import com.example.viewpager.fragments.onboarding.OnboardingThirdFragment
import com.example.viewpager.fragments.onboarding.OnboardingSecondFragment

private const val FRAGMENT_COUNT = 3

class ViewPagerAdapter(activity: FragmentActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> OnboardingFirstFragment()
            1 -> OnboardingSecondFragment()
            2 -> OnboardingThirdFragment()
            else -> OnboardingThirdFragment()
        }
    }
}