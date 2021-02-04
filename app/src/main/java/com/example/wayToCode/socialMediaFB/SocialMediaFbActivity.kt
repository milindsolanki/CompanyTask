package com.example.wayToCode.socialMediaFB

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wayToCode.R
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import kotlinx.android.synthetic.main.activity_social_media_fb.*
import java.util.*


class SocialMediaFbActivity : AppCompatActivity() {
    private val EMAIL = "email"
    var callbackManager: CallbackManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media_fb)
        /*try {
            val info =
                packageManager.getPackageInfo(
                    "com.example.wayToCode",
                    PackageManager.GET_SIGNATURES
                )
            for (signature in info.signatures) {
                val md: MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                Log.e("MY KEY HASH:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
            }
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        }*/

        intiView()
    }

    private fun intiView() {
        login_button.setOnClickListener {
            val accessToken = AccessToken.getCurrentAccessToken()
            val isLoggedIn = accessToken != null && !accessToken.isExpired


            login_button.setReadPermissions(Arrays.asList(EMAIL))

            callbackManager = CallbackManager.Factory.create()
            LoginManager.getInstance()
                .logInWithReadPermissions(this, Arrays.asList("public_profile"));

            LoginManager.getInstance().retrieveLoginStatus(this, object : LoginStatusCallback {
                override fun onCompleted(accessToken: AccessToken) {
                    // User was previously logged in, can log them in directly here.
                    // If this callback is called, a popup notification appears that says
                    // "Logged in as <User Name>"
                }

                override fun onFailure() {
                    // No access token could be retrieved for the user
                }

                override fun onError(exception: Exception) {
                    // An error occurred
                }
            })


            LoginManager.getInstance().registerCallback(callbackManager,
                object : FacebookCallback<LoginResult?> {
                    override fun onSuccess(loginResult: LoginResult?) {
                        // App code
                    }

                    override fun onCancel() {
                        // App code
                    }

                    override fun onError(exception: FacebookException) {
                        // App code
                    }
                })
        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        callbackManager?.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)
    }
}