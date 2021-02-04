package com.example.wayToCode

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayToCode.sheredpref.PreferenceHelper

open class BaseActivity : AppCompatActivity() {
   lateinit var sharPref: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharPref= PreferenceHelper.customPrefs(this)

    }
}