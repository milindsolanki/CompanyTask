package com.example.wayToCode.intentTask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_login_task.*
import java.util.regex.Pattern

class LoginTaskActivity : AppCompatActivity() {
    var number:String= ""
    var password :String= ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_task)
        intiview()
    }

    private fun intiview() {
        btn_login.setOnClickListener {
            if (etdPhoneNum.text.toString().isEmpty()) {
                etdPhoneNum.error = "Enter valid Data"
            } else if (etdPhoneNum.text.toString().length > 10) {
                etdPhoneNum.error = "Enter Phone Number 10 digit"
            } else if (etdPassword.text.toString().isEmpty()) {
                etdPassword.error = "Enter valid Data"
            } else if (etdPassword.text.toString().length > 6) {
                etdPassword.error = "Enter Password minimum 6 digit"
            } else {
                if (etdPhoneNum.text.toString().trim().contentEquals(number)&&etdPassword.text.toString().trim().contentEquals(password)) {
                    Toast.makeText(this, "done", Toast.LENGTH_LONG).show()
                }
                /*val intent = Intent(this, RegTaskActivity::class.java)
                startActivityForResult(intent, 1)*/
            }
        }
        btnRegistration.setOnClickListener {
            val intent = Intent(this, RegTaskActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            number=data!!.getStringExtra("PASSWORD").toString()
            password = data?.getStringExtra("PHONENUMBER").toString()
        }
    }
}