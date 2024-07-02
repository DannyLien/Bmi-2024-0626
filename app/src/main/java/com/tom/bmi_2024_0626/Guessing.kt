package com.tom.bmi_2024_0626

fun main() {
    val secret = 7
    print("Please enter a number(1-10): ")
    val input = readLine()
    val num: Int = input?.toIntOrNull() ?: 0
    println("The number you entered: $num")
    if (num < secret) {
        println("Bigger")
    } else if (num > secret) {
        println("Smaller")
    } else {
        println("You got it!")
    }


}