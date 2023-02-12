package com.example.olimpv2

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.res.TypedArrayUtils.getText

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
        val login_Data = mutableMapOf<String, String>("admin" to "admin")
        login_button.setOnClickListener{
            val IntentHome = Intent(this, home::class.java)
            val user_Login = edit_login.text.toString()
            val user_Password = edit_password.text.toString()
            if (login_Data.containsKey(user_Login) && login_Data.containsValue(user_Password)){
                startActivity(IntentHome)
            }
            else {
                val toast = Toast.makeText(this,"Некоторые данные заполнены некорректно!",Toast.LENGTH_SHORT)
                toast.show()
            }
        }
        }
    }
