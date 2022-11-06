package com.example.olimpv2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var reg_button: Button = findViewById(R.id.reg_button)
        reg_button.setOnClickListener{
            val Intent1 = Intent(this,register::class.java)
            startActivity(Intent1)
        }
        var login_button: Button = findViewById(R.id.login_button)
        login_button.setOnClickListener{
            val Intent2 = Intent(this,login::class.java)
            startActivity(Intent2)
        }
    }
}