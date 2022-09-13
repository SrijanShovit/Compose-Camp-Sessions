package Colllections

val myInstaFollowers: MutableList<String> = mutableListOf("Ifra","Sameer","Rani")
val bestFriends: List<String> = listOf<String>("Khushi","Pranshu")

fun addFollowers(newUser: String) {
    myInstaFollowers.add(newUser)
}

fun myBestFriends(): List<String> {                                  // 4
    return bestFriends
}

fun main() {
    addFollowers("Kalpesh")
    println("Tot followers: ${myInstaFollowers.size}")               // 6
    myBestFriends().forEach {                                     // 7
            i -> println("Hi $i")
    }

//     myBestFriends().add("Ritwik") <- Error!                           // 8
}