/*
fun functionName(param1: type1, param2: type2, ...): returnType {
    // function body
    return result
}
 */

fun add(a: Int, b: Int): Int {
    return a + b
}

fun print(name: String, lastName: String = "Dogra"): Unit {
   println(name + " " + lastName)
}

fun print(vararg numbers: Int) {
    numbers.forEach { println(it) }
}

/*

A lambda function is a function that is defined without a name and can be passed
as an argument to a higher-order function. Here's an example of a lambda function:
(Int, Int) -> Int type of anonymous function
*/

var add: (Int, Int) -> Int = {a, b -> a + b}
var sub: (Int, Int) -> Int = {a, b -> a - b}

/*
Higher-order functions and lambda functions are closely related concepts in Kotlin.

A higher-order function is a function that takes another function as a parameter, or
returns a function as its result. Here's an example of a higher-order function
that takes a function as a parameter:
 */

fun operate(a: Int, b: Int, op: (Int, Int) -> Int){
    print(op(a, b))
}

/*
inline function
In Kotlin, an inline function is a function that is expanded by the compiler at the call
site, instead of generating a separate function call. This can help reduce the runtime
overhead of calling a function, which can be especially useful for functions that are
called frequently.

To declare an inline function in Kotlin,
you simply add the inline keyword before the fun keyword
in the function declaration. Here's an example:
 */

inline fun doSomething(block: () -> Unit) {
    println("Before")
    block()
    println("After")
}


fun main() {
    var sum = add(2, 3)
    println(sum)

    var name = "Shubham"
    print(name)

    print(1, 2, 4, 5)

    operate(3, 3, add)
    operate(4, 2, sub)
}