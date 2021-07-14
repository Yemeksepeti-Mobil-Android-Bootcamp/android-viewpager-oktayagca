package com.example.viewpager.utils
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.fragments.OnboardingFirstFragment
import com.example.viewpager.fragments.OnboardingThirdFragment
import com.example.viewpager.fragments.OnboardingSecondFragment

private const val FRAGMENT_COUNT = 3

class ViewPagerAdapter(activity: FragmentActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> OnboardingFirstFragment()
            1 -> OnboardingSecondFragment()
            2 -> OnboardingThirdFragment()
            else ->OnboardingThirdFragment()
        }
    }
}