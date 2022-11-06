package com.example.olimpv2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var olim_list_button: Button = findViewById(R.id.olimp_list_button)
        olim_list_button.setOnClickListener{
            var IntentList = Intent(this, OlimpList::class.java)
            startActivity(IntentList)
        }
    }
}