package com.example.wayToCode.sherePreftask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.wayToCode.BaseActivity
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_shere_pref_login.*
import com.example.wayToCode.sheredpref.PreferenceHelper.get
import com.example.wayToCode.sheredpref.PreferenceHelper.set
import com.example.wayToCode.sheredpref.USER_EMAIL
import com.example.wayToCode.sheredpref.USER_PASSWORD
import kotlinx.android.synthetic.main.forgot_password_dialog.view.*

class SherePrefLoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shere_pref_login)
        initView()
    }

    private fun initView() {
        txtForgot.setOnClickListener {
            val dialog = LayoutInflater.from(this).inflate(R.layout.forgot_password_dialog, null)
            val mBuiler = AlertDialog.Builder(this)
                .setView(dialog)
                .setTitle("Froggot PassWord")
            val alertDialog = mBuiler.show()
            dialog.btnDone.setOnClickListener {
                if (dialog.etdPassword.text.toString()
                        .contentEquals(dialog.etdConfirmPwd.text.toString().trim())
                ) {
                    sharPref[USER_PASSWORD] = dialog.etdPassword.text.toString().trim()
                    alertDialog.dismiss()
                    startActivity(Intent(this, SherePrefLoginActivity::class.java))
                } else {
                    Toast.makeText(this, "Does not PassWord", Toast.LENGTH_SHORT).show()
                }

            }
            dialog.btnCancel.setOnClickListener {
                alertDialog.dismiss()
            }

        }
        txtRegister.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SherePferRegActivity::class.java
                )
            )
        }
        btn_login.setOnClickListener {
            if (etdEmail.text.toString().isEmpty()) {
                etdEmail.error = "is Emapty"
            } else if (etdPassword.text.toString().isEmpty()) {
                etdPassword.error = "is Emapty"
            } else {
                if (etdEmail.text.toString().trim().contentEquals(sharPref[USER_EMAIL, ""]!!) &&
                    etdPassword.text.toString().trim().contentEquals(sharPref[USER_PASSWORD, ""]!!)
                ) {
                    startActivity(Intent(this, SherePrefMainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "user not register", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}