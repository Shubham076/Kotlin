fun main() {

    /*
        Using arrayOf function: This function is used to create an array
         with elements of any type.
     */

    val numbers = arrayOf(1, 2, 3, 4, 5)
    val names = arrayOf("John", "Sarah", "Bob")

    /*
    Using specific type array functions: These functions are used to create an array of a specific type,
     like intArrayOf, charArrayOf, booleanArrayOf, etc.
     */
    val arr = intArrayOf(1, 2, 3, 4, 5)

    /*
    Using Array constructor: This function is used to create an array of a specific
    size. You provide a lambda function that generates the initial values based on
     the index.

     { it * 2 } is a lambda expression that takes a single parameter "it",
      which refers to the index of the current element being initialized.
      The expression multiplies "it" by 2 and returns the resulting value.
    */
    val n = Array(5) { it * 2 }  // creates an Array<Int> with values 0, 2, 4, 6, 8
    val animals = Array<String>(size = 5) { "" }
    animals[0] = "lion"
    animals[1] = "tiger"
    animals[2] = "bear"
    animals[3] = "elephant"
    animals[4] = "zebra"

    //size of array
    var size = n.size

    val firstNumber = numbers.get(0)    // gets the first number
     numbers.set(0, 10)                 // sets the first number to 10
    /*
        val firstNumber = numbers[0]        // gets the first number
        numbers[0] = 10                     // sets the first number to 10
    */
    //first and last of array
    val first= numbers.first()
    val last = numbers.last()


    //for index of item
    val index = numbers.indexOf(3)

    /*
        traversing
     */

    numbers.forEach { println(it) }
    numbers.forEachIndexed { index, value -> println("Element at $index is $value") }

}