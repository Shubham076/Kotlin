package oops

import java.beans.PersistenceDelegate
import java.time.Period

/*
There are two types of constructors in Kotlin:

Primary constructor: This is part of the class header and
is declared after the class name.

Secondary constructor: This is declared inside the class.
*/


/*
Access specifiers:
* public: The property is visible everywhere. This is the default visibility,
          so you don't usually need to specify it.
* private: The property is only visible inside the class that declares it.
* protected: The property is visible inside the class that declares it and in all subclasses of that class. Note that protected is not available for top-level declarations.
* internal: The property is visible everywhere in the same module.
 */
class Person (first: String, last: String) {

    var first: String
    var last : String
    init {
        this.first = first
        this.last = last
    }

    //for extra properties not initialized in constructors
    private var age: Int = 0
    private var _address: String = ""
        var address: String
            get() {
            return _address
            }
            set(value) {
                _address = value
            }

    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }
}

fun main() {
    var p = Person("Shubham", "Dogra", 10)
    p.address = "ABC"
}
