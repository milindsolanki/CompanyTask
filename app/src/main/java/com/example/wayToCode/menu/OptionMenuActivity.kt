package com.example.wayToCode.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.wayToCode.R

class OptionMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
        intiView()
    }

    private fun intiView() {

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
menuInflater.inflate(R.menu.pop_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.nav_gallery->
            {
                Toast.makeText(this,"Click"+item.title, Toast.LENGTH_SHORT).show()
            }
            R.id.nav_home->
            {
                Toast.makeText(this,"Click"+item.title, Toast.LENGTH_SHORT).show()

            }
            R.id.nav_slideshow->
            {
                Toast.makeText(this,"Click"+item.title, Toast.LENGTH_SHORT).show()

            }

        }
        return super.onOptionsItemSelected(item)
    }
}