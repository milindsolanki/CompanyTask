package com.example.wayToCode.navigation

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_navigation_darwar.*

class NavigationDarwarActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener {
    lateinit var fragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_darwar)
        //setSupportActionBar(toolbar)
        fragment = HomeFragment()
        replaceFragment(fragment)
        intiView()
        nav_view.setNavigationItemSelectedListener(this)

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.nav_frame, fragment).commit()
    }

    private fun intiView() {
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                fragment = HomeFragment()
                replaceFragment(fragment)
            }
            R.id.nav_gallery -> {
                fragment = GallaryFragment()
                replaceFragment(fragment)
            }
            R.id.nav_slideshow -> {
                fragment = SlideShowFragment()
                replaceFragment(fragment)
            }

        }
        return true
    }
}