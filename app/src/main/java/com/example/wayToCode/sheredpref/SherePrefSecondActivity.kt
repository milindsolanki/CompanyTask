package com.example.wayToCode.sheredpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayToCode.BaseActivity
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_shere_pref_second.*
import com.example.wayToCode.sheredpref.PreferenceHelper.get


class SherePrefSecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shere_pref_second)
        intiView()
    }

    private fun intiView() {
        txtName.text=sharPref[USER_NAME,""]
        txtEmail.text=sharPref[USER_EMAIL,""]
    }
}