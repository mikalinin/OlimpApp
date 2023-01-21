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
        login_button.setOnClickListener{
            val IntentHome = Intent(this, home::class.java)
            if (edit_login.text.toString()=="admin" && edit_password.text.toString()=="admin"){
                startActivity(IntentHome)
            }
        }
    }

    //Мое
    fun loginQuery():Boolean{
        val edit_login: EditText= findViewById(R.id.edit_login)
        val edit_password: EditText=findViewById(R.id.edit_password1)
        if (edit_login.getText().toString()=="" || edit_password.getText().toString()==""){
            return false
        }
        return true
    }
    fun onLogin(){
        val toast = Toast.makeText(this,"Некоторые данные заполнены некорректно!",Toast.LENGTH_SHORT)
        if (loginQuery()) {
            val home_intent = Intent(this, home::class.java)
            startActivity(home_intent)
        }
        else {
            toast.show()
        }
    }
}