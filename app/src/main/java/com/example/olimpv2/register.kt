 package com.example.olimpv2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.jsonMapper

 class register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val edit_name: EditText = findViewById(R.id.edit_name)
        val edit_class: EditText = findViewById(R.id.edit_password)
        //val User = UserClass(edit_name.text.toString(), edit_class.text.toString().toInt(), edit_login.text.toString())
        //val userJson = jsonMapper().writeValueAsString(User)
        val reg_button: Button = findViewById(R.id.button2)
        reg_button.setOnClickListener{
            var Intent_Home = Intent(this, home::class.java)
            startActivity(Intent_Home)
        }

    }
}