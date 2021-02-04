package com.example.wayToCode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // intiview()
    }

    private fun intiview() {
        btn_login.setOnClickListener {

            val intent = Intent(this, homeActivity::class.java)
            Toast.makeText(this, "WelCome", Toast.LENGTH_LONG)
            startActivityForResult(intent,1)
        }

        TODO("Not yet implemented")
    }
}