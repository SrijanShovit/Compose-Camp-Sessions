fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0 }

    val negatives = numbers.filter { it < 0 }

    for (x in numbers) print("$x ")
    println()
    for (x in positives) print("$x ")
    println()
    for (x in negatives) print("$x ")
}
