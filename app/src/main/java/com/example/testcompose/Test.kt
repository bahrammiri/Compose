package com.example.testcompose

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread


fun log(msg: String) = println("${Thread.currentThread().name} -> $msg")
suspend fun main() {
    networkRequest()

}

//fun networkRequest() = runBlocking {
//
//    repeat(
//        10
//    ) {
//        delay(1000)
//        println("ddd")
//    }
//}
//fun networkRequest() = runBlocking {
//
//    repeat(
//        10
//    ) {
//        launch {
//            delay(3000)
//            println("ddd")
//        }
//
//    }
//}
fun networkRequest() = runBlocking {

    repeat(
        100000
    ) {
        thread {
Thread.sleep(2000)
            println("ddd")
        }

    }
}

