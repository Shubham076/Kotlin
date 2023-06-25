package multithreading.couroutines

import kotlinx.coroutines.*

/*
The await() function is a suspending function that suspends the coroutine in which it's called until the result of the Deferred object it's called on is ready. During the time the coroutine is suspended, the underlying thread is not blocked, it can be used to run other coroutines or do other work.
 */
fun main() {
    runBlocking {
        val deferred = async {
            delay(1000L)
            "Hello, World!"
        }
        println("The result is: ${deferred.await()}")
    }
}