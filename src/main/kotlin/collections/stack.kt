package collections
/*
In Kotlin, there are no specific Stack
and Queue classes as in Java. However,
you can use Java's Stack and Queue classes
because Kotlin is fully interoperable with Java.
 */
fun main() {
    val stack = java.util.Stack<String>()

// Pushing elements onto the stack
    stack.push("element1")
    stack.push("element2")
    stack.push("element3")

    println(stack) // Output: [element1, element2, element3]

// Popping an element from the stack
    val e = stack.pop()

    println(e) // Output: element3
    println(stack) // Output: [element1, element2]

    val queue = java.util.ArrayDeque<String>()

    // Adding elements to the queue
    queue.add("element1")
    queue.add("element2")
    queue.add("element3")

    println(queue) // Output: [element1, element2, element3]

    // Removing an element from the queue
    val element = queue.remove()

    println(element) // Output: element1
    println(queue) // Output: [element2, element3]

}