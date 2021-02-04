package com.example.wayToCode.navAndRec

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.wayToCode.tabLayout.Tab1Fragment
import com.example.wayToCode.tabLayout.Tab2Fragment
import com.example.wayToCode.tabLayout.Tab3Fragment

@Suppress("DEPRECATION")
class TabAdapterData(context: Context?, fragment: FragmentManager, val tabCount: Int) :
    FragmentStatePagerAdapter(fragment),DataTranfer {


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                TabOneFragment()

            }
            1 -> {
                TabTwoFragment()
            }
            else -> return getItem(position)
        }
    }

    override fun getCount(): Int {
        return tabCount
    }



    override fun sendData(email: String, password: String) {

    }


}