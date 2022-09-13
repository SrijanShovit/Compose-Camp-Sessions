open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

//Kotlin classes are final by default.
//If you want to allow the class inheritance, mark the class with the open modifier.
//Kotlin methods are also final by default.
//As with the classes, the open modifier allows overriding them.

fun main() {
    //All Smartphones are Phones
    val dog: Dog = Yorkshire()
    val dog2: Dog = Dog()
    //a dog object can not be Yorkshire bcz Yorkshire will have its own attributes not present in dogs
    //but all phones are not Smartphones
//    val dog3: Yorkshire = Dog()
    val dog4: Yorkshire = Yorkshire()
    dog.sayHello()
    dog2.sayHello()
    dog4.sayHello()
}