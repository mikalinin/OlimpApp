package com.example.olimpv2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var edit_user: EditText=findViewById(R.id.edit_user)
        var edit_password: EditText = findViewById(R.id.edit_password)
        var login_button: Button = findViewById(R.id.login_button)
        var login_locked: TextView = findViewById(R.id.login_locked)
        login_button.setOnClickListener{
            var IntentHome = Intent(this, home::class.java)
            //Проверка с базой данных
            if (edit_user.text.toString()=="admin" && edit_password.text.toString()=="admin"){
                startActivity(IntentHome)
            }
            else{
                login_locked.setText("Wrong login")
            }
        }
    }
}