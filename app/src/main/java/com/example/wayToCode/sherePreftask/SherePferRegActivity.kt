package com.example.wayToCode.sherePreftask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayToCode.BaseActivity
import com.example.wayToCode.R
import com.example.wayToCode.sheredpref.*
import kotlinx.android.synthetic.main.activity_shere_pfer_reg.*
import com.example.wayToCode.sheredpref.PreferenceHelper.set


class SherePferRegActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shere_pfer_reg)
        intiView()
    }

    private fun intiView() {
        btnRegistration.setOnClickListener {
            if (etdName.text.toString().isEmpty()) {
                etdName.error = "is emply"
            } else if (etdEmail.text.toString().isEmpty()) {
                etdEmail.error = "is emply"
            } else if (etdPhoneNum.text.toString().isEmpty()) {
                etdPhoneNum.error = "is emply"
            } else if (etdLocation.text.toString().isEmpty()) {
                etdLocation.error = "is emply"
            } else if (etdPassword.text.toString().isEmpty()) {
                etdPassword.error = "is emply"
            } else {
                sharPref[USER_NAME] = etdName.text.toString().trim()
                sharPref[USER_EMAIL] = etdEmail.text.toString().trim()
                sharPref[USER_PHONE] = etdPhoneNum.text.toString().trim()
                sharPref[USER_LOCATION] = etdLocation.text.toString().trim()
                sharPref[USER_PASSWORD] = etdPassword.text.toString().trim()
                startActivity(Intent(this, SherePrefLoginActivity::class.java))
            }
        }

    }
}