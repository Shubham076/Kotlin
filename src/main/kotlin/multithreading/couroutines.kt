package multithreading
import kotlinx.coroutines.*
/*

The runBlocking function in Kotlin is a bridge between regular blocking code
and suspending functions (like coroutines). It's a built-in function that blocks
the current thread (intentionally) until the coroutine it contains (and all its children)
completes.

alternate of run block
 */

fun add(a: Int, b: Int): Int {
    return a + b
}
fun main() {
    for (i in 1..100) {
        runBlocking {
            // launch is a coroutine builder that launches a new coroutine without returning a result
            launch(Dispatchers.Default) {
                val v = add(2, 3)
            }
        }
        print("$i ")
    }


    for (i in 1..100) {
        runBlocking {
//    async is a coroutine builder that launches a new coroutine and returns an instance of Deferred<T>
            var f = async(Dispatchers.Default) {
                add(2, 3)
            }
            val res = f.await() // wait for the result
            println("User data: $res")
        }
        print("$i ")
    }
    println()

    println("All co-routines closed")
}