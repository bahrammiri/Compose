package com.example.testcompose

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class NumberViewModel : ViewModel() {

    var number = mutableIntStateOf(1)

    fun generateNumber() {
        number.value++
    }

}