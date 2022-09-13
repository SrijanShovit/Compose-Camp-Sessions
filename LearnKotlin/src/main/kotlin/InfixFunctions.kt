//Kotlin allows some functions to be called without using the period and brackets.
//These are called infix methods, and their use can result in code that looks much more like a natural language
//It must be member function or extension function.
//It must accept a single parameter.
//The parameter must not accept variable number of arguments and must have no default value.
//It must be marked with infix keyword

fun main(){
    infix fun Int.times(str:String) = str.repeat(this)
    println(3 times "Srijan")

    //to => Creates a tuple of type Pair from this and that
    val pair = "Ferrari" to "Katrina"
    println(pair)

    //own implementation of to creatively called onto
    infix fun String.onto(other:String) = Pair(this,other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val raj = Person("Raj")
    val harish = Person("Harish")
    val girish = Person("Girish")
    raj likes harish
    raj likes girish


}

class Person(val name:String){
    //it becomes dynamic and we can modify its data as per requirement.
    // A mutable list grows automatically in size as we insert new elements into it
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other:Person){
        likedPeople.add(other)
        for (i in likedPeople) print(i.name + " ")
        println()
    }
}