package com.example.blog_app_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.example.blog_app_project.register.WelcomeActivity

@Suppress("DEPRECATION")

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({

            val i = Intent(this@SplashScreen, WelcomeActivity::class.java)

            startActivity(i)
            finish()
                              }, 10000)
                    }
                }