package com.example.wayToCode.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wayToCode.MainActivity
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        initView()
    }

    private fun initView() {
        btnExplicitIntent.setOnClickListener(this)
        btnImplicitIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            btnImplicitIntent -> {

                /* web url
                val url="https://www.hyperlinkinfosystem.com/who-we-are.html"
                val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
                //intent.data=Uri.parse(url)
                startActivity(intent)*/

                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"
                val appUrl="http/play.google.com/store/app/detail?id=com.example.wayToCode"
                intent.putExtra(Intent.EXTRA_TEXT,appUrl)
                startActivity(Intent.createChooser(intent,"Share"))

            }

            btnExplicitIntent -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }

    }
}