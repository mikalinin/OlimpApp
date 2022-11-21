package com.example.olimpv2

data class OlimpClass(
    val title:String,
    val subjects:List<String>,
    val classes:List<Int>,
    val rating: Double,
    val link:String,
    val time_table: List<Any>
)