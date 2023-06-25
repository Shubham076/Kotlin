package collections
import java.util.PriorityQueue;

fun main() {
    // Creating a PriorityQueue
    var priorityQueue = PriorityQueue<Int>()
    // Adding elements to the PriorityQueue
    priorityQueue.add(3)
    priorityQueue.add(1)
    priorityQueue.add(2)

    // Printing the PriorityQueue
    println(priorityQueue) // Output: [1, 3, 2]

    // Removing an element from the PriorityQueue
    var element = priorityQueue.remove()

    println(element) // Output: 1
    println(priorityQueue) // Output: [2, 3]


    val pq = java.util.PriorityQueue<String>(compareByDescending { it.length })

    pq.add("apple")
    pq.add("banana")
    pq.add("kiwi")

    println(priorityQueue) // Output: [banana, apple, kiwi]

    element = priorityQueue.remove()

    println(element) // Output: banana
    println(pq) // Output: [apple, kiwi]

}