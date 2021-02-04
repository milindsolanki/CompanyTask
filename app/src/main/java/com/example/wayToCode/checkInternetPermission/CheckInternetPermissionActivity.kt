package com.example.wayToCode.checkInternetPermission

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_check_internet_permission.*

class CheckInternetPermissionActivity : AppCompatActivity() {
    private val INTERNET_CODE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_internet_permission)
        intiView()
    }

    private fun intiView() {
        btnCheck.setOnClickListener {
            if (checkNetwork()) {
                Toast.makeText(this, "Network connection is available", Toast.LENGTH_SHORT).show()
            } else if (!checkNetwork()) {
                Toast.makeText(this, "Network connection is not available", Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }

    private fun checkNetwork(): Boolean {
        val connManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        return connManager.activeNetworkInfo != null && connManager.activeNetworkInfo!!.isConnected
    }


}

