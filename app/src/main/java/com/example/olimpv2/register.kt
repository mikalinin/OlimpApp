 package com.example.olimpv2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        val edit_class: EditText = findViewById(R.id.edit_class)
        val edit_login: EditText = findViewById(R.id.edit_login_reg)
        val User = UserClass(edit_name.text.toString(), edit_class.text.toString().toInt(), edit_login.text.toString())
        //val userJson = jsonMapper().writeValueAsString(User)

    }
}