package com.example.wayToCode.tabLayout

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_tab.*
import java.util.*

class TabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)
        intiView()

    }

    private fun intiView() {
        tabs.addTab(tabs.newTab().setText("Tsb1"))
        tabs.addTab(tabs.newTab().setText("Tsb2"))
        tabs.addTab(tabs.newTab().setText("Tsb3"))
        val madapter=TabAdepter(this,supportFragmentManager,tabs!!.tabCount)
        view_pager.adapter=madapter
        view_pager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs!!.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_pager!!.currentItem=tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })
    }
}