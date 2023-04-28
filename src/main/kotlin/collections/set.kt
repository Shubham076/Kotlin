package collections

/*
set is an interface with implementations -> HashSet, LinkedHashSet, and TreeSet
 */

fun main() {

    // Creating an immutable set
    val set = setOf("element1", "element2", "element3")
    println(set) // Output: [element1, element2, element3]

    // Trying to add a duplicate element
    val setWithDuplicates = setOf("element1", "element2", "element3", "element1")
    println(setWithDuplicates) // Output: [element1, element2, element3]

    // Creating a mutable set
    val mutableSet = mutableSetOf("element1", "element2", "element3")


    val hashSet = HashSet<String>()

    hashSet.add("element1")
    hashSet.add("element2")
    hashSet.add("element3")

    println(hashSet) // Output: [element1, element3, element2]

    hashSet.remove("element1")
    println(hashSet) // Output: [element3, element2]
}