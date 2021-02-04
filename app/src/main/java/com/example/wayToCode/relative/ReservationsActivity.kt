package com.example.wayToCode.relative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_reservations.*
import kotlinx.android.synthetic.main.apptoolbar.*

class ReservationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservations)
        intiview()
    }

    private fun intiview() {
        txtBack.setOnClickListener {
            finish()
        }
        btn_confirm.setOnClickListener {
            Toast.makeText(this, "Done", Toast.LENGTH_LONG).show()
        }
    }
}