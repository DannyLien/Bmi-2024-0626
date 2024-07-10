package com.tom.bmi_2024_0626

fun main() {
    val drinks = mutableMapOf<Int, String>(
        1 to "Coke",
        2 to "7-UP",
        3 to "Wuloong",
        4 to "Orange"
    )
    println(drinks)
    println(drinks.get(3))
    drinks.put(5, "Water")
    println(drinks)

}