package com.example.wayToCode.relative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_home__relative_.*

class Home_Relative_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home__relative_)
        intiview()
    }

    private fun intiview() {
        btn_menu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}