package com.example.wayToCode.sherePreftask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.wayToCode.BaseActivity
import com.example.wayToCode.R
import com.example.wayToCode.sheredpref.PreferenceHelper.get
import com.example.wayToCode.sheredpref.USER_EMAIL

class SplashActivity : BaseActivity() {
    val SPLASH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initView()
    }

    private fun initView() {
        Handler().postDelayed({
            var email = sharPref[USER_EMAIL, ""]
            val intent: Intent
            if (email!!.isEmpty()) {
                intent = Intent(this, SherePrefLoginActivity::class.java)
            } else {
                intent = Intent(this, SherePrefMainActivity::class.java)
            }
            startActivity(intent)
            finish()

        }, SPLASH_TIME_OUT)
    }
}