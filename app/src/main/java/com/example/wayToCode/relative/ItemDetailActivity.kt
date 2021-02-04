package com.example.wayToCode.relative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.apptoolbar.*

class ItemDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)
        setSupportActionBar(toolbar)

        intiview()
    }

    private fun intiview() {
        txtBack.setText("")
        btn_order.setOnClickListener {
            val intent = Intent(this, ReservationsActivity::class.java)
            startActivity(intent)
        }

        txtBack.setOnClickListener {
            finish()
        }
    }
}