package com.ethantech.ecomerce.onBoarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.ethantech.ecomerce.R

class Splash : AppCompatActivity() {
    private val SPLASH_TIMER = 2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val i = Intent(this@Splash, OnBoarding::class.java)
            startActivity(i)
            finish()

        }, SPLASH_TIMER.toLong())
    }
}