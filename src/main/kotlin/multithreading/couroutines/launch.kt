package multithreading.couroutines
import kotlinx.coroutines.*

/*
Coroutine scopes are important in Kotlin to manage when groups of related coroutines should be cancelled. They help structure concurrency in a way that is less error-prone and easy to manage. Kotlin provides different kinds of coroutine scopes:

GlobalScope: This scope lives for as long as your application does, so any coroutines launched in this scope will only be destroyed when your app is closed. This is rarely what you want, as it can lead to memory leaks, so it should be used sparingly.

CoroutineScope: This is an interface that can be implemented wherever you need a scope. It creates a new scope and does not complete until all launched children complete. CoroutineScope can be used in conjunction with any context like Dispatchers.Default, Dispatchers.IO, etc.

viewModelScope (Android): A special scope provided for Android ViewModel classes, which gets cancelled when the ViewModel is cleared (typically, when the UI is no longer visible).

lifecycleScope (Android): Available on any component that implements LifecycleOwner (like AppCompatActivity or Fragment), this scope automatically cancels its coroutines based on the lifecycle state.

withContext: Although not a coroutine scope, it's worth mentioning here. It's used to switch the context of execution between different dispatchers (like switching to Dispatchers.IO for network or database operations).

Remember, it's generally a bad idea to run coroutines on GlobalScope as they might run indefinitely. Also, avoid creating a new CoroutineScope without specifying its lifecycle. This can potentially lead to memory leaks because you could easily forget to cancel the coroutine, resulting in the coroutine running indefinitely.
 */

fun add(a: Int, b: Int): Int {
    return a + b
}

fun test(a:Int, b: Int) {
    var scope = CoroutineScope(Dispatchers.Default)
    scope.launch {
        add(a, b)
    }
    /*
    scope.cancel() in Kotlin Coroutines is a function that cancels all coroutines launched within that particular scope.

    When you cancel a coroutine scope, it cancels all currently active and future jobs within that scope.
    scope.cancel()
     */
}

fun main() = runBlocking {
    // launch is a coroutine builder that launches a new coroutine without returning a result
    var job = launch(Dispatchers.Default) {
        delay(1000)
        val v = add(2, 3)
        println("Result: $v")
    }
   // job.cancel()  cancels the job
   // job.join()  waits for job's completion
    while(!job.isCompleted){}
    println("Co-routine completed")
    test(10, 20)
}