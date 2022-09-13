package Generics//Generic classes and functions increase code reusability
//by encapsulating common logic that is independent of a particular generic type,
//like the logic inside a List<T> is independent of what T is

//Generic Classes

class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main(){
    var st = MutableStack<Int>(1,5,6,34,17)
    println(st.peek())
    println(st.push(48))
    println(st.peek())
    println(st.toString())
    println(st.size())
    println(st.isEmpty())
    println(st.pop())

    main2()
}

//Generic Functions
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main2() {
    val stack = mutableStackOf(0.62, 3, 2.7)
    stack.push(8F)
    println(stack)
}