package com.tom.bmi_2024_0626


fun main() {
    //Array
    val array = intArrayOf(2, 5, 8)
    println(array[2])
    val ss = arrayOf("SUN", "MON", "TUE")
    println(ss.size)
    println(ss.get(0))
    for (day in ss) println(day)

    //For
    val rang = 0..10
    for (i in 1..30) {
        if (i % 2 == 1) print("*") else print(" ")
    }
    println()
    for (i in 1..10 step 2) print(i)

    var name: String? = "Hank"
    println(name?.length)
    println(name ?: 0)

    var counter = 0
    counter = counter + 1
    counter++
    counter = counter - 1

    println(counter)
    println(10 / 3.0)

    //Boolean
    var b = false
    var a = false
//    println(a && b)
//    println(a || b)
//    //
//    val num = -8
//    println(num <= 5 && num >= -3)
//    //
//    println(num > 5 || num <= 3)

}
















