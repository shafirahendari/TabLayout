package com.example.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayout.fragments.*

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0->{
                FirstFragment()
            }
            1->{
                SecondFragment()
            }
            2->{
                ThirdFragment()
            }
            3->{
                FourthFragment()
            }
            4->{
                FivethFragment()
            }
            5->{
                SixthFragment()
            }
            else->{
                Fragment()
            }
        }
    }
}