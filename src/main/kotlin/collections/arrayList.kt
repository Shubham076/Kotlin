package collections

/*
val arrayList: ArrayList<Type> = ArrayList()
 */
fun main() {
    // Creating an empty ArrayList
    val arrayList = ArrayList<String>()

    var size = arrayList.size

// Adding elements to the ArrayList
    arrayList.add("element1")
    arrayList.add("element2")
    arrayList.add("element3")

// Printing elements
    println(arrayList)

// Removing an element
    arrayList.remove("element2")

// Printing elements after removal
    println(arrayList)

// Adding an element at a particular index
    arrayList.add(1, "element4")

// Printing elements after adding an element
    println(arrayList)

}