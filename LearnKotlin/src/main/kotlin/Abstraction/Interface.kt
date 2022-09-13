package Abstraction
interface Camera{
    open fun clickPhoto()
    fun makeVideo()
    {
        println("Teri video viral hogi ab to")
    }
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

class SmartPhone:Phone(),Camera{
    override fun saveContact() {
        super.saveContact()
        println("Image added to contact")
    }

    override fun call() {
        super.call()
        println("Video calling")
    }

    override fun clickPhoto() {

        println("Bin filter ke photo le li")
    }


}

class FiveGPhone:Phone(),Camera{
    override fun clickPhoto() {
        println("Teri to filter ke saath snap nikali hai")
    }
}

fun main(){
    val puranaPhone = Phone()
    puranaPhone.call()

    println("--------------------------------------")
    val pocoKaPhone = SmartPhone()
    pocoKaPhone.makeVideo()
    pocoKaPhone.clickPhoto()

    println("-------------------------------")
    val badeLogonKaMehangaPhone = FiveGPhone()
    badeLogonKaMehangaPhone.makeVideo()
    badeLogonKaMehangaPhone.clickPhoto()
}