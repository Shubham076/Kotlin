package multithreading
import kotlinx.coroutines.*
/*

The runBlocking function in Kotlin is a bridge between regular blocking code
and suspending functions (like coroutines). It's a built-in function that blocks
the current thread (intentionally) until the coroutine it contains (and all its children)
completes.

alternate of run block
 */
fun main() {
    runBlocking {
        val jobs = List(100) { // launch a lot of coroutines and list their jobs
            launch(Dispatchers.Default) {
                println("This is coroutine $it. Thread name: ${Thread.currentThread().name}")
            }
        }
    }
    println("All co-routines closed")
}