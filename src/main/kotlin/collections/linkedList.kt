package collections
import java.util.LinkedList

fun main() {
    // Creating a LinkedList
    val linkedList = LinkedList<String>()

    // Adding elements to the LinkedList
    linkedList.add("element1")
    linkedList.add("element2")
    linkedList.add("element3")

    // Printing the LinkedList
    println(linkedList) // Output: [element1, element2, element3]

    // Getting an element from the LinkedList
    val element1 = linkedList[0]
    println(element1) // Output: element1

    // Removing an element from the LinkedList
    linkedList.remove("element1")

    // Printing the LinkedList after removal
    println(linkedList) // Output: [element2, element3]

}