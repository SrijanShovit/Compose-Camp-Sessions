package SpecialClasses

//A non-parameterized default constructor is created by Kotlin automatically.
class CustomerNC(val name:String)

class ContactNC(val id: Int, var email: String)

fun main() {

    val customer = CustomerNC("Srijan")
    val customer2 = CustomerNC("Srijan")
    println(customer)
    println(customer2)
    println(customer == customer2)


    val contact = ContactNC(1, "mary@gmail.com")

    println(contact.id)
    contact.email = "jane@gmail.com"
    println(contact.email)
}