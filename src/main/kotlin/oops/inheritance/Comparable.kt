package oops.inheritance

data class Car(val name: String, val price: Int) {
}

/*
val sortedPeople = people.sortedWith(compareBy({ it.age }, { it.name }))
or we can use chaining
 */
fun main() {
    val car = listOf(
        Car("Alice", 25),
        Car("Bob", 30),
        Car("Charlie", 20)
    )

    // sort people by height and age
    val byHeightAndAge = compareBy<Car> { it.name }
        .thenByDescending { it.price }

    val sortedCar = car.sortedWith(byHeightAndAge)

    // print sorted list of people
    for (car in sortedCar) {
        println("${car.name}, ${car.price}")
    }
}