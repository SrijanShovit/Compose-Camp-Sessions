fun printMessage(message:String):Unit{
    //Unit is equivalent to void
//    hi()
    println(message)
}

fun printMessageWithPrefix(message: String,prefix:String="Info"){
//    hi()
    println("$prefix $message")
}

fun sum(x:Int,y:Int):Int{
    //Local functions--nesting of functions
    fun hi(){
        println("hi")
    }

//    hi()
    return x+y;
}

fun multiply(x:Double,y:Int,z:Float):Double= x*y*z;
fun main(){


    printMessage("Hello")
    printMessageWithPrefix("Hello","Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix="Log",message="Hello")
    println(sum(1,2))
    //F is must to denote float else it is treated as Double
    print(multiply(2.7,4,5.7F))




//    hi()
}

//hi()