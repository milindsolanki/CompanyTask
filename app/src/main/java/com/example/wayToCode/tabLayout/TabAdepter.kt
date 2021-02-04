package com.example.wayToCode.tabLayout

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class TabAdepter(context: Context?, fragmet: FragmentManager, val tabCount: Int) :
    FragmentPagerAdapter(fragmet) {


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Tab1Fragment()
            }
            1 -> {
                Tab2Fragment()
            }
            2 -> {
                Tab3Fragment()
            }
            else -> return getItem(position)
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}