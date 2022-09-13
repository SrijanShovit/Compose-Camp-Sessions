fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)


    val anyNegative = numbers.any { it < 0 }
    print(anyNegative)

    val anyGT6 = numbers.any { it > 6 }
    print(anyGT6)

    val allEven = numbers.all { it % 2 == 0 }
    print(allEven)

    val allLess6 = numbers.all { it < 6 }
    print(allLess6)


    val allEven2 = numbers.none { it % 2 == 1 }
    print(allEven2)

    val allLess62 = numbers.none { it > 6 }
    print(allLess62)


}