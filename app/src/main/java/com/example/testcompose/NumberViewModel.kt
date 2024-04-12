package com.example.testcompose

import android.util.Log
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class NumberViewModel : ViewModel() {

    var number = mutableIntStateOf(1)

    fun generateNumber() {

        viewModelScope.launch {

            delay(2000)
            number.value++
        }


    }

    override fun onCleared() {
        super.onCleared()

        Log.i("CCC--->", "onCleared")

    }

}

