package com.tom.bmi_2024_0626.vending

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GuessViewModel : ViewModel() {
    var secret = (1..10).random()
    var secretData = MutableLiveData<Int>()
    val status = MutableLiveData<GameStatus>()
    var counter = MutableLiveData<Int>()

    init {
        secretData.value = secret
        counter.value = 0
        status.value = GameStatus.INIT
    }

    fun guess(num: Int) {
        status.value = when (num - secret) {
            in 1..Int.MAX_VALUE -> GameStatus.SMALLER
            0 -> GameStatus.NUMBER_RIGHT
            else -> GameStatus.BIGGER
        }
        var c = counter.value ?: 0
        c++
        counter.value = c
    }

    fun reset() {
        secret = (1..10).random()
        secretData.value = secret
        counter.value = 0
        status.value = GameStatus.INIT
    }

}

enum class GameStatus {
    INIT, BIGGER, SMALLER, NUMBER_RIGHT
}
