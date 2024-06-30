package com.tom.bmi_2024_0626

class Hello {
}


fun main() {

    val p = Person("Jack", 65.5f, 1.7f)
    println(p.bmi())
    val hank = Person("Hank", 70f, 1.75f)
    println(p.name + " " + p.bmi())
    println(hank.name + " " + hank.bmi())
    p.hello()

//    val p = Person()
//    p.hello()
//    p.weight = 65.5f
//    p.height = 1.7f
    println("BMI:${p.bmi()}")

    /*
        println("Hello kotlin!!")
        val age = 20
        val pupulation_2: Long = 9999   //Long
        val pupulation_1 = 9999L        //Long
        println(age.inc())
        println(age)
        var name = "Hank"   //val name
        println(name.plus(""))
        println(name.get(1))
        name = "Jack"   //var name
        println(name)

        val weight: Float = 65.5f

        val isAdult = false

        val c = 'A'

        println(c)
     */

}