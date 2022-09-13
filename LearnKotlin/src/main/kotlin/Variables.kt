fun main(){
    val breakfast = "roti"
    val lunch = 3
    val dinner = 2.5
    val foo = 1
    println(breakfast+"$foo "+lunch+" ${foo}"+dinner)

    //var for mutable
    //val for immutable

    var a:String = "initial"
    println(a)
    a = "final"
    println(a)

    val b = 1
    //type inference
    println(b::class.simpleName)
//    b = 3

    //variable can be declared without initialisation
    //but initialisation must be done before usage
    val d: Int

    if (b == 1) {
        d = 1
    } else {
        d = 2
    }

    println(d)
}