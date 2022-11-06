package com.example.olimpv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OlimpList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olimp_list)
        var olimp_info_button:Button = findViewById(R.id.olimp_info_button)
        olimp_info_button.setOnClickListener{
            var IntentOlimpInfo = Intent(this,OlimpInfo::class.java)
            startActivity(IntentOlimpInfo)
        }
    }
}