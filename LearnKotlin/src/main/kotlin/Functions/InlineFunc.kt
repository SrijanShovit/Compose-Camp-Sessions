package Functions

//Works good with higher order methods

fun main(args: Array<String>) {
    var a = 2
    println(someMethod(a, {println("Just some dummy function")}))

}
inline fun someMethod(a: Int, func: () -> Unit):Int {
    func()
    return 2*a
}

/*
   Situtaion after inlining:
   println(
       fun someMethod(a: Int, println("Just some dummy function") -> Unit):Int {
           println("Just some dummy function")
           return 2*a
           }
    )
   * */