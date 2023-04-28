package oops.inheritance

open class Parent {
    open var name = "Parent"

    open fun print() : Unit {
        println("Parent called")
    }
}