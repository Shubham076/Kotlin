
/*
Data type in kotlin
Numbers: Kotlin provides several types of numbers:

Byte: 8-bit signed integer (-128 to 127)
Short: 16-bit signed integer (-32768 to 32767)
Int: 32-bit signed integer (-2,147,483,648 to 2,147,483,647)
Long: 64-bit signed integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
Float: 32-bit floating point number
Double: 64-bit floating point number
Characters: Kotlin represents characters using Char type.

Booleans:

Strings:

Arrays: Kotlin provides the Array class to represent arrays. The class has get and set functions, size property,
 and a few other useful member functions.

Nullability: One special thing about Kotlin's type system is that it
distinguishes nullable references from non-nullable references.
For example, a regular String cannot hold a null. If you need to
allow null, you can declare a variable as String?.
 */


/*
Ways to decalre variable in kotlin
Immutable variable (val): Use the val keyword to declare an immutable variable,
which means its value cannot be changed after it has been assigned. This is similar
 to a final variable in Java or a const variable in some other languages.

Mutable variable (var): Use the var keyword to declare a mutable variable, which means its
value can be changed after it has been assigned.
 */
fun main() {

    //immutable variable (equalt to final in java, const in js/go)
    val x:Int = 10

    //mutable variable
    var y:Int = 20

    //type inference no need to declare type Kotlin has a powerful type inference system,
    //so you often don't need to specify the type explicitly when declaring a variable.
    var z = 30

    //lateinit variables
    lateinit var a: String
     a = "Shubham"

    //nullable variables
    val name: String? = null
    var age: Int? = null
}