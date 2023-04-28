package oops.inheritance

fun main() {

    //case1 ref and initlization is of parent
    println("Case1: ref is of parent and object is of parent")
    var parent = Parent()
    parent.print()

    /*
    kotlin wont allow to use same property in child without override so it means everytime
    child properties are printed
     */
    println("Case2: ref is of parent and object is of child")
    var parent2 = Child()
    parent2.print()
    println(parent2.name)

    println("Case3: ref is of child and object is of child")
    var child = Child()
    child.print()

}