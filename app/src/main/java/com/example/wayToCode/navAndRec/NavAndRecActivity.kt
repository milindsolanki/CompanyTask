package com.example.wayToCode.navAndRec

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import com.example.wayToCode.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_nav_and_rec.*
import kotlinx.android.synthetic.main.activity_tab.*
import kotlinx.android.synthetic.main.content_main.*

class NavAndRecActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener,
    DataTranfer {
    lateinit var fragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_and_rec)
        fragment = ClickDeleteFragment()
        replaceFragment(fragment)
        intiView()
        nav_view.setNavigationItemSelectedListener(this)
    }

    private fun intiView() {
        btm_nav_view.visibility = View.GONE
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.nav_frame, fragment).commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.click_delete -> {
                replaceFragment(ClickDeleteFragment())
            }
            R.id.long_delete -> {
                replaceFragment(LongPressDeleteFragment())
            }
            R.id.swap_delete -> {
                replaceFragment(SwapDeleteFragment())
            }
            R.id.tab_data_move -> {
                replaceFragment(TabMoveDataFragment())
            }
        }
        return true
    }

    override fun sendData(email: String, password: String) {

    }


}