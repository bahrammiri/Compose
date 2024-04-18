package com.example.testcompose

import android.util.Log
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class NumberViewModel : ViewModel() {

    var number = mutableIntStateOf(1)

    //    var job: Job? = null
    var isRun = false

    fun generateNumber() {

        if (!isRun) {

            viewModelScope.launch(Dispatchers.IO) {
                isRun = true
                delay(2000)
                number.value++
                isRun = false
            }


        }
    }

    override fun onCleared() {
        super.onCleared()

        Log.i("CCC--->", "onCleared")

    }

}


