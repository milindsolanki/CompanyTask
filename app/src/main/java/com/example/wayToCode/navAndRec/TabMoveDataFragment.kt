package com.example.wayToCode.navAndRec

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wayToCode.R
import com.example.wayToCode.tabLayout.TabAdepter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_tab.*
import kotlinx.android.synthetic.main.fragment_tab_move_data.*
import kotlinx.android.synthetic.main.fragment_tab_move_data.tabs
import kotlinx.android.synthetic.main.fragment_tab_move_data.view.*


class TabMoveDataFragment : Fragment(), DataTranfer {
    lateinit var fragment: Fragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tab_move_data, container, false)
        intiView(view)
        return view
    }

    private fun intiView(view: View) {

        view.tabs.addTab(view.tabs.newTab().setText("Tsb1"))
        view.tabs.addTab(view.tabs.newTab().setText("Tsb2"))
        val madapter =
            TabAdapterData(context, requireActivity().supportFragmentManager, view.tabs!!.tabCount)
        view.view_pager.adapter = madapter
        view.view_pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        view.tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                view.view_pager!!.currentItem = tab!!.position

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }
        })
    }

    override fun sendData(email: String, password: String) {
        fragment = TabTwoFragment()
        val tag = R.id.view_pager + 1
        fragment.activity?.supportFragmentManager?.findFragmentById(tag)
        (fragment as TabTwoFragment).dataRecive(email, password)
    }

}