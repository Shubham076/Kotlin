package multithreading.couroutines

import kotlinx.coroutines.*

/*
runBlocking is a function in Kotlin Coroutines used to bridge the synchronous world with the asynchronous world. It starts a new coroutine and blocks the current thread until its completion. This is a way to make a coroutine work in a synchronous way.
 */
fun main() {
    runBlocking {
        launch {
            test1WithCoroutines()
        }

        launch {
            test2WithCoroutines()
        }
    }
    println("Main func completed")
}

suspend fun test1WithCoroutines() {
    println("Start coroutines test 1")
    delay(500)
    println("End coroutines test 1")
}

suspend fun test2WithCoroutines() {
    println("Start coroutines test 2")
    delay(1000)
    println("End coroutines test 2")
}