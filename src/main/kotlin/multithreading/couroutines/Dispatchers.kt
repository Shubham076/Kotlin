package multithreading.couroutines

/*
In Kotlin, Dispatchers is an object used in Coroutine scope that determines which thread the coroutine should run on. It's part of the kotlinx.coroutines library. There are several built-in dispatchers:

Dispatchers.Main: This dispatcher confines the coroutine to the Main thread. It's typically used for UI-related tasks in Android.

Dispatchers.IO: This dispatcher is optimized for offloading blocking IO tasks to a shared pool of threads.

Dispatchers.Default: This dispatcher is optimized for CPU-intensive tasks. It uses a shared pool of threads that's sized up to the number of CPU cores.

Dispatchers.Unconfined: This dispatcher starts the coroutine in the caller thread, but only until the first suspension point. After suspension, it resumes in the thread that is fully determined by the suspending function that was invoked.

Here's an example of how you might use dispatchers in a coroutine:
 */

import kotlinx.coroutines.*

fun dispatch() = runBlocking {
    launch(Dispatchers.Main) {
        // UI-related task
    }
    launch(Dispatchers.IO) {
        // IO-intensive task
    }
    launch(Dispatchers.Default) {
        // CPU-intensive task
    }
    launch(Dispatchers.Unconfined) {
        // Unconfined task
    }
}
