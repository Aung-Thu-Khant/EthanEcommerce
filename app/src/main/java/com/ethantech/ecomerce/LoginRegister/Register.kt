package com.ethantech.ecomerce.LoginRegister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ethantech.ecomerce.Home.Homepage
import com.ethantech.ecomerce.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import maes.tech.intentanim.CustomIntent

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<FloatingActionButton>(R.id.registerbtn).setOnClickListener{
            startActivity(Intent(this,Homepage::class.java))
            CustomIntent.customType(this,"bottom-to-up")
            finish()
        }

    }


    override fun finish() {
        super.finish()
        CustomIntent.customType(this,"right-to-left")
    }

}