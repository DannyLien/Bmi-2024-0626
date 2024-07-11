package com.tom.bmi_2024_0626

class GuessGame {
    var secret = (1..10).random()
    var counter = 0
    fun guess(n: Int): Int {
        counter++
        return secret - n
    }

    fun reset() {
        secret = (1..11).random()
        counter = 0
    }

}


fun main() {
    val game = GuessGame()
    val num = 3
    val result = game.guess(num)
    if (result < 0) {
    } else if (result > 0) {
    } else {
    }

}





