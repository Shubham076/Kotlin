package oops

class MyGenericClass<T>(var value: T) {
        init {
            this.value = value
        }
    fun printValue(): T {
        return this.value
    }
}
