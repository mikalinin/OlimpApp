package com.example.olimpv2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class OlimpList : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olimp_list)
        val Olimplist: ListView =findViewById(R.id.Olimp_List)
        var arr = ArrayList<OlimpClass>()
        arr.add(OlimpClass("Rosatom", listOf("Math"), listOf(11),10.7,"fbvjhbfj", listOf("jkvjbd")))
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        Olimplist.adapter = adapter
        Olimplist.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this, "Pos: $position",Toast.LENGTH_SHORT).show()
        }
    }
}