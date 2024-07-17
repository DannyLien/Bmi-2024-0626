package com.tom.bmi_2024_0626.vending

import java.io.File


fun main() {
    val drinks = listOf<Drink>(
        Drink("Black tea",0,50),
        Drink("Green tea",0,45),
        Drink("Wuloon tea",0,60)
    )

    val out = File("order.txt").bufferedWriter()
    for (d in drinks) {
        out.write("${d.name},${d.suger},${d.price}\n")
    }
    out.flush()
}
















