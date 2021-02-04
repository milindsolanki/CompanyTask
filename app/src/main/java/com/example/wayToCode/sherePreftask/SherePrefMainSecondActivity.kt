package com.example.wayToCode.sherePreftask

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wayToCode.BaseActivity
import com.example.wayToCode.R
import com.example.wayToCode.sheredpref.*
import kotlinx.android.synthetic.main.activity_shere_pref_main_second.*
import com.example.wayToCode.sheredpref.PreferenceHelper.get
import com.example.wayToCode.sheredpref.PreferenceHelper.set

class SherePrefMainSecondActivity : BaseActivity() {
    var str: String = ""
    var i: Int = 0
    var flo: Float = 0F
    var boolen: Boolean = false
    var long: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shere_pref_main_second)

        intiView()
    }

    private fun intiView() {
        btnSand.setOnClickListener {

            cardSecond.visibility = View.VISIBLE
            txtString.text = sharPref[USER_STRING, ""]
            txtInt.text = sharPref[USER_INT, 0].toString()
            txtFloat.text = sharPref[USER_FLOAT, 0.0f].toString()
            txtLong.text = sharPref[USER_LONG, 0L].toString()
            txtBoolen.text = sharPref[USER_Boolean, true].toString()

        }
        btnSet.setOnClickListener {
            sharPref[USER_STRING] = etdString.text.toString().trim()
            sharPref[USER_INT] = etdInt.text.toString().trim().toInt()
            sharPref[USER_FLOAT] = etdFloat.text.toString().trim().toFloat()
            sharPref[USER_LONG] = etdLong.text.toString().trim().toLong()
            sharPref[USER_Boolean] = etdBoolean.text.toString().trim().toBoolean()
            etdString.text.clear()
            etdInt.text.clear()
            etdFloat.text.clear()
            etdLong.text.clear()
            etdBoolean.text.clear()
        }

    }
}