package com.example.wayToCode.sherePreftask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayToCode.BaseActivity
import com.example.wayToCode.R
import com.example.wayToCode.sheredpref.*
import com.example.wayToCode.sheredpref.PreferenceHelper.get
import kotlinx.android.synthetic.main.activity_shere_pref_main.*
import kotlinx.android.synthetic.main.activity_shere_pref_second.*
import kotlinx.android.synthetic.main.activity_shere_pref_second.txtName
import kotlinx.android.synthetic.main.activity_shere_pref_second.txtEmail as txtEmail1


class SherePrefMainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shere_pref_main)
        intiView()
    }

    private fun intiView() {
        txtName.text = sharPref[USER_NAME, ""]
        txtEmail.text = sharPref[USER_EMAIL, ""]
        txtPhoneNum.text = sharPref[USER_PHONE, ""]
        txtLocation.text = sharPref[USER_LOCATION, ""]
        txtPassword.text = sharPref[USER_PASSWORD, ""]
        btnLogout.setOnClickListener {
            sharPref.edit().clear().commit()
            startActivity(Intent(this, SherePrefLoginActivity::class.java))
            finish()
        }
    }
}