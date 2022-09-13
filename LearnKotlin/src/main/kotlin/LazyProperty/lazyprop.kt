package LazyProperty

val pi:Float by lazy{
    //lazy takes a lamba function
    3.14f
}

//val pi:Float = 3.14f
fun main(){
    println("hi")
    println(pi)
}