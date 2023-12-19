package com.atasksolutions.shopinger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn: Button = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
        }

        val joinBtn: Button = findViewById(R.id.join_btn)

        joinBtn.setOnClickListener {
            val intent = Intent(this, RegActivity::class.java)
        }
    }
}