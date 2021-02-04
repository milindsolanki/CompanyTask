package com.example.wayToCode.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_pop_menu.*

class PopMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_menu)
        intiView()
    }

    private fun intiView() {
        btnClick.setOnClickListener {
            val popmenu: PopupMenu = PopupMenu(this, btnClick)
            popmenu.menuInflater.inflate(R.menu.pop_menu, popmenu.menu)
            popmenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.nav_gallery -> {
                        startActivity(Intent(this, OptionMenuActivity::class.java))
                        Toast.makeText(this, "Click" + item.title, Toast.LENGTH_SHORT).show()
                    }
                    R.id.nav_home -> {
                        Toast.makeText(this, "Click" + item.title, Toast.LENGTH_SHORT).show()

                    }
                    R.id.nav_slideshow -> {
                        Toast.makeText(this, "Click" + item.title, Toast.LENGTH_SHORT).show()

                    }

                }
                true
            }
            popmenu.show()
        }
    }
}