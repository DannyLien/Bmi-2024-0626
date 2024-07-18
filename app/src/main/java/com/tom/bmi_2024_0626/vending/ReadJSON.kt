package com.tom.bmi_2024_0626.vending

import java.net.URL

fun main() {
//    URL("https://api.jsonserve.com/AXh1oX")
    val input = URL("https://api.jsonserve.com/j74OdE").openStream()
    val reader = input.bufferedReader()
    var line = reader.readLine()
    while (line != null) {
        println(line)
        line = reader.readLine()
    }

}









