package multithreading

fun main() {
    val thread = Thread {
        Thread.sleep(3000)
        // code here will be executed in a new thread
        println("This is running in a thread. Thread name: ${Thread.currentThread().name}")
    }
    thread.start() // don't forget to start the thread
//    thread.join()
}