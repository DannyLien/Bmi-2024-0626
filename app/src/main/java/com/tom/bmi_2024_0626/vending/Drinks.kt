package com.tom.bmi_2024_0626.vending

fun main() {
    val s = "abcef"
    println(s.validate())

    val tea = Drink("Black tea", 0, 50)
    println(tea)
    val discountTea = tea.off20()
    println(discountTea)
    val tea2 = tea.copy(suger = 50) //data class have fun copy()
//    println(tea2)

    val drinks = mutableMapOf<Int, String>(
        1 to "Coke", 2 to "7-UP", 3 to "Wuloong", 4 to "Orange"
    )
    println(drinks)
    println(drinks.get(3))
    drinks.put(5, "Water")
    println(drinks)

}

fun Drink.off20(): Drink {
    return this.copy(price = (this.price * 0.8).toInt())

}

fun String.validate(): Boolean {
    return this.length >= 6
}



