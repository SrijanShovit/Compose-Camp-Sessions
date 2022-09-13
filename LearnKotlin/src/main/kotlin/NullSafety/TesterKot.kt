package NullSafety

//Save from NullPointerException as compared to Java
//Kotlin don't allow the assignment of null

fun strLength(notNull: String?): Int {
    return if (notNull == null) 0 else notNull.length
}
fun main(){
    var neverNull: String = "Main nalla nhi hoon"
    //neverNull = null
    println(neverNull)

    var nullable: String? = "Main ban skta hoon"
    nullable = null
    println(nullable)

    var inferredNonNull = "Tu mereko nalla assume krne ki glti mt krna re baba"
//    inferredNonNull = null



    println(strLength(neverNull))
    println(strLength(nullable))



    println(describeString(neverNull))
    println(describeString(nullable))
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}