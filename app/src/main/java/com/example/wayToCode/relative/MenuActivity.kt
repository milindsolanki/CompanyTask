package com.example.wayToCode.relative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.apptoolbar.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        intiview()
    }

    private fun intiview() {
        rlItemOne.setOnClickListener {
            val intent = Intent(this, ItemDetailActivity::class.java)
            startActivity(intent)

        }
        txtBack.setOnClickListener {
            finish()
        }


    }
}