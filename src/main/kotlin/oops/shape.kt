package oops
/*
The class must provide an implementation for all the methods
 and properties defined in the interface.
 */
interface shape {
    fun foo()
    fun test() {
        println("abc")
    }
    val bar: Int
}

class MyClass : shape {
     override fun foo() {
        println("foo")
    }

    override fun test() {

    }

    override val bar: Int = 42
}