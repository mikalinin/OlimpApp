package com.example.olimpv2

data class OlimpClass(
    val title:String,
    val subjects:List<String>,
    val classes:List<Int>,
    val rating:Float,
    val link:String,
    val time_table:Map<String, String>
)