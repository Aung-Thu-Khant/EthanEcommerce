package com.ethantech.ecomerce.LoginRegister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ethantech.ecomerce.R
import maes.tech.intentanim.CustomIntent

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<TextView>(R.id.txtRegister).setOnClickListener {
            startActivity(Intent(this,Register::class.java))
            CustomIntent.customType(this,"left-to-right")
        }
    }


}