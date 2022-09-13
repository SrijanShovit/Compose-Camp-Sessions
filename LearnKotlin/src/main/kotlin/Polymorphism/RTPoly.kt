package Polymorphism

fun main(){
    var buttonWalaPhone = Phone()
    buttonWalaPhone.saveContact()
    buttonWalaPhone.call()
    buttonWalaPhone.receiveCall()

    println("----------------------------------------")

    var touchScreenPhone = SmartPhone()
    touchScreenPhone.saveContact()
    touchScreenPhone.call()
    touchScreenPhone.receiveCall()

    println("------------------------------------------")

    var samsungGalaxy:Phone = SmartPhone()
    samsungGalaxy.saveContact()
    samsungGalaxy.call()
    samsungGalaxy.receiveCall()

    println("------------------------------------------")

//    var meraphone:SmartPhone = Phone()
//    meraphone.call()

}

open class Phone{
    open fun saveContact(){
        println("Saving contacts")
    }
    open fun call(){
        println("Call a relative/friend")
    }
    fun receiveCall(){
        println("Call picked")
    }
}

class SmartPhone:Phone(){
    override fun saveContact() {
        super.saveContact()
        println("Image added to contact")
    }

    override fun call() {
        super.call()
        println("Video calling")
    }


}