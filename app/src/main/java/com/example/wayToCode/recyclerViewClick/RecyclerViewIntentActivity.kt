package com.example.wayToCode.recyclerViewClick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_recycler_view_intent.*
import kotlinx.android.synthetic.main.apptoolbar.*
import kotlinx.android.synthetic.main.user_list_adapter.view.*

class RecyclerViewIntentActivity : AppCompatActivity() {
    var rusID: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_intent)
        intiView()
        setSupportActionBar(toolbar)
    }

    private fun intiView() {
        txtBack.setText("Back").toString().trim()
        if (intent != null) {

            txtName.text = intent.getStringExtra("NAME")
            txtEmail.text = intent.getStringExtra("EMAIL")
            txtNumber.text = intent.getStringExtra("NUMBER")
            Log.d("Tag",intent.getStringExtra("IMAGE").toString())
            Glide.with(this).load(intent.getStringExtra("IMAGE")).centerCrop().into(img)


        }
        txtBack.setOnClickListener {
            finish()
        }
    }

}