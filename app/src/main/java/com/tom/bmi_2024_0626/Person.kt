package com.tom.bmi_2024_0626

class Person {

    var weight = 0f
    var height = 0f

    fun bmi(): Float = weight / (height * height)

    fun hello() {
        println("Hello")

    }

}