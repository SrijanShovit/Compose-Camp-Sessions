val numsSet: MutableSet<Int> = mutableSetOf(3,3,4)

fun addToSet(num: Int): Boolean {
    return numsSet.add(num)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "added correctly" else "marked as duplicate and rejected."
}

fun main() {
    val aNewNum: Int = 61
    val aNewNumberMayBe: Int = 4

    println("Number $aNewNum ${getStatusLog(addToSet(aNewNum))}")
    println("Number $aNewNumberMayBe ${getStatusLog(addToSet(aNewNumberMayBe))}")
}