fun main() {
    //for loop
    for (i in 1..5 step 3) {
        println(i)
    }

    for (i in 10 downTo 1 step 1) {
        println(i)
    }


    //while loop
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }

    //do while
    i = 1
    do {
        println(i)
        i++
    } while (i <= 5)

    //for each
    val fruits = listOf("apple", "banana", "orange")
    fruits.forEach { println(it) }

    fruits.asReversed().forEach { println(it) }

    //repeat
    repeat(3) {
        println("Hello")
    }

}