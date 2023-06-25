package multithreading.couroutines
import kotlinx.coroutines.*;
import kotlinx.coroutines.channels.Channel

fun main() {
    val channel = Channel<Int>()
    var j = CoroutineScope(Dispatchers.Default).launch {
        launch {
            // this might be heavy CPU-consuming computation or async logic, we'll just send five squares
            for (x in 1..5) channel.send(x * x)
            channel.close()
        }
        // here we print five received integers:
        repeat(5) { println(channel.receive()) }

        // other way of iterating over channel
        // here we print received values using `for` loop (until the channel is closed)
        // for (y in channel) println(y)
        println("Done!")
    }
    while(!j.isCompleted){}
}