
//Kotlin uses == for structural comparison
//and === for referential comparison.
fun main(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    val authors2 = setOf("Shakespeare", "Hemingway", "Twain")
    val writers2 = setOf("Shakespeare", "Hemingway", "Twain")

    println(authors == writers)
    println(authors === writers)
    println(authors2 === writers2)
    println(authors === authors)
}
