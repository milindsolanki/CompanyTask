package com.example.wayToCode.whatsappFrg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.wayToCode.R
import com.example.wayToCode.fragment.OneFragment
import kotlinx.android.synthetic.main.activity_whats_app_frg.*

class WhatsAppFrgActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var fragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whats_app_frg)
        fragment = WhatsAppChatFragment()
        replaceFragment(fragment)
        intiview()
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }

    private fun intiview() {
        btnChat.setOnClickListener(this)
        btnStatus.setOnClickListener(this)
        btnCall.setOnClickListener(this)
    }

    override fun onClick(click: View?) {
        when (click) {
            btnChat -> {
                fragment = WhatsAppChatFragment()
                replaceFragment(fragment)
            }
            btnStatus -> {
                replaceFragment(WhatsAppStatusFragment())

            }
            btnCall -> {

                replaceFragment(WhatsAppCallFragment())
            }


        }
    }
}