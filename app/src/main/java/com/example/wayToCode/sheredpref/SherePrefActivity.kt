package com.example.wayToCode.sheredpref

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayToCode.BaseActivity
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_shere_pref.*
import com.example.wayToCode.sheredpref.PreferenceHelper.set

class SherePrefActivity :BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shere_pref)
        intiView()
    }

    private fun intiView() {
      sharPref[USER_NAME]=etdName.text.toString().trim()
        sharPref[USER_EMAIL]=etdEmail.text.toString().trim()
        val intent=Intent(this,SherePrefSecondActivity::class.java)
        startActivity(intent)

    }
}