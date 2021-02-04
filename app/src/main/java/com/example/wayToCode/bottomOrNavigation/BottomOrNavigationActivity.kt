package com.example.wayToCode.bottomOrNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.wayToCode.R
import com.example.wayToCode.navigation.GallaryFragment
import com.example.wayToCode.navigation.HomeFragment
import com.example.wayToCode.navigation.SlideShowFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_bottom_or_navigation.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*

class BottomOrNavigationActivity : AppCompatActivity() {
    var str: String? = ""
    lateinit var fragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_or_navigation)
        fragment = HomeBtmNavFragment()
        replaceFragment(fragment)
        //intiView()
        navigation_view.setNavigationItemSelectedListener(navigationView)
        btm_nav_view.setOnNavigationItemSelectedListener(bottomView)

        changeFragment(str!!)
    }

    private val bottomView = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {

                fragment = HomeBtmNavFragment()
                replaceFragment(fragment)
            }
            R.id.nav_gallery -> {

                fragment = GalleryBtmNavFragment()
                replaceFragment(fragment)
            }
            R.id.nav_slideshow -> {
                fragment = SlideBtmNavFragment()
                replaceFragment(fragment)
            }
        }
        return@OnNavigationItemSelectedListener false
    }

    private val navigationView = NavigationView.OnNavigationItemSelectedListener { item ->

        if (item.itemId.toString().isNotEmpty()) {
            str = item.itemId.toString()
            when (item.itemId) {
                R.id.nav_home -> {
                    replaceFragment(HomeFragment())
                }
                R.id.nav_gallery -> {
                    changeFragment(str!!)
                }
                R.id.nav_slideshow -> {
                    changeFragment(str!!)
                }
            }
        }


        return@OnNavigationItemSelectedListener true
    }

    private fun changeFragment(str: String) {

        if (str.contentEquals("Home")) {
            fragment = HomeBtmNavFragment()
            replaceFragment(fragment)
        } else if (str.contentEquals("Gallery")) {
            fragment = GalleryBtmNavFragment()
            replaceFragment(fragment)
        } else if (str.contentEquals("Slideshow")) {
            fragment = SlideBtmNavFragment()
            replaceFragment(fragment)
        } else {
            Toast.makeText(this, "Not Selected ", Toast.LENGTH_SHORT).show()
        }
    }

    private fun replaceFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction().replace(R.id.nav_frame, fragment).commit()

    }



}