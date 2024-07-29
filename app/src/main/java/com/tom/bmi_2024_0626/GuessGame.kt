package com.tom.bmi_2024_0626

class GuessGame {
    enum class Status {
        INIT, BIGGER, SMALLER, BINGO
    }

    var secret = (1..11).random()
    var counter = 0
    var status = Status.INIT
    fun guess(n: Int): Status {
        counter++
        return if (n > secret) Status.SMALLER
        else if (n < secret) Status.BIGGER
        else Status.BINGO
    }

    fun reset() {
        secret = (1..11).random()
        counter = 0
    }

}


//fun main() {
//    val game = GuessGame()
//    val num = 3
//    val result = game.guess(num)
//    if (result < 0) {
//    } else if (result > 0) {
//    } else {
//    }
//
//}





