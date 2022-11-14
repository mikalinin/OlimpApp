package com.example.olimpv2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edit_login: EditText= findViewById(R.id.edit_login)
        val edit_password: EditText=findViewById(R.id.edit_password1)
        val reg_button: Button = findViewById(R.id.reg_button)
        reg_button.setOnClickListener{
            val Intent1 = Intent(this,register::class.java)
            startActivity(Intent1)
        }
        val login_button: Button = findViewById(R.id.login_button)
        login_button.setOnClickListener{
            val IntentHome = Intent(this, home::class.java)
            if (edit_login.text.toString()=="admin" && edit_password.text.toString()=="admin"){
                startActivity(IntentHome)
            }
        }
    }
}