package UserInput

fun main(){
    val begin = System.nanoTime()
    println("Enter a string:")
    val userInput = readLine()
    println("User's string input : $userInput")
    val end = System.nanoTime()

    println("Elapsed time in nanoseconds: ${(end-begin)/1000000}")
}