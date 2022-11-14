package com.example.olimpv2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class OlimpInfo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olimp_info)
        val text: TextView =findViewById(R.id.text1)
        val mapper = jacksonObjectMapper()
        val jsonString = """{"title": "\u041c\u043e\u0441\u043a\u043e\u0432\u0441\u043a\u0430\u044f \u043c\u0430\u0442\u0435\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u043e\u043b\u0438\u043c\u043f\u0438\u0430\u0434\u0430", "subjects": ["\u041c\u0430\u0442\u0435\u043c\u0430\u0442\u0438\u043a\u0430"], "classes": [8, 9, 10, 11], "rating": 9.0, "link": "https://olimpiada.ru/activity/1", "time_table": {}}"""
        val Olimp1: OlimpClass = mapper.readValue(jsonString)
        text.text=Olimp1.title


    }
}