package com.example.wayToCode.intentTask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_login_task.*
import kotlinx.android.synthetic.main.activity_reg_task.*
import kotlinx.android.synthetic.main.activity_reg_task.btnRegistration
import kotlinx.android.synthetic.main.activity_reg_task.etdPassword
import kotlinx.android.synthetic.main.activity_reg_task.etdPhoneNum

class RegTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_task)
        intiview()
    }

    private fun intiview() {
        btnRegistration.setOnClickListener {
            if (etdName.text.toString().isEmpty()) {
                etdName.error = "Enter valid Data"
            } else if (etdEmail.text.toString().isEmpty()) {
                etdEmail.error = "Enter valid Data"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(etdEmail.text.toString()).matches()) {
                etdEmail.error = "Enter valid Data"
            } else if (etdPhoneNum.text.toString().isEmpty()) {
                etdPhoneNum.error = "Enter valid Data"
            } else if (etdPhoneNum.text.toString().length < 10) {
                etdPhoneNum.error = "Enter Phone Number 10 digit"
            } else if (etdLocation.text.toString().isEmpty()) {
                etdLocation.error = "Enter valid Data"
            } else if (etdPassword.text.toString().isEmpty()) {
                etdPassword.error = "Enter valid Data"
            } else if (etdPassword.text.toString().length > 6) {
                etdPassword.error = "Enter Password minimum 6 digit"
            } else if (etdConfirmPwd.text.toString().isEmpty()) {
                etdConfirmPwd.error = "Enter valid Data"
            } else if (etdConfirmPwd.text.toString().length > 6) {
                etdConfirmPwd.error = "Enter Password minimum 6 digit"
            } else if (etdConfirmPwd.text.toString().trim()
                != etdPassword.text.toString().trim()
            ) {
                etdConfirmPwd.error = "password does't match"
            } else {
                val intent = Intent()
                intent.putExtra("PASSWORD",etdConfirmPwd.text.toString().trim())
                intent.putExtra("PHONENUMBER",etdConfirmPwd.text.toString().trim())

                setResult(1, intent)
                finish()


            }
        }
    }
}