package com.tom.bmi_2024_0626.vending

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GuessViewModel : ViewModel() {
    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun guess(toInt: Int) {
        var c = counter.value ?: 0
        c++
        counter.value = c
    }

}