package oops

class Comparison(val name: String, val age: Int) : Comparable<Comparison> {
    override fun compareTo(other: Comparison): Int {
        return this.age.compareTo(other.age)
    }
}
