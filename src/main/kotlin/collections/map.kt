package collections

/*
map in interface with 3 implementation hashmap, linkedhashmap, treemap
 */

fun main() {
    //immutable map
    var hashMap = mapOf("key1" to "value1", "key2" to "value2", "key3" to "value3")
    println(hashMap)

    hashMap = hashMapOf("key1" to "value1", "key2" to "value2", "key3" to "value3")
    println(hashMap) // Output: {key1=value1, key2=value2, key3=value3}

    // Creating a HashMap
    hashMap = HashMap<String, String>()

    // Adding elements to the HashMap
    hashMap["key1"] = "value1"
    hashMap["key2"] = "value2"
    hashMap["key3"] = "value3"

    // Printing the HashMap
    println(hashMap) // Output: {key1=value1, key2=value2, key3=value3}

    // Getting a value from the HashMap
    val value1 = hashMap["key1"]
    println(value1) // Output: value1

    // Removing a value from the HashMap
    hashMap.remove("key1")

    // Printing the HashMap after removal
    println(hashMap) // Output: {key2=value2, key3=value3}

}