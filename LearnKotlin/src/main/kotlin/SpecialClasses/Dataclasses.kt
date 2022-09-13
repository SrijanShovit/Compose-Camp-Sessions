package SpecialClasses

data class Customer(val name:String,val age:Int)


fun main() {
    //show how diff age param changes the object
    val customer = Customer("Srijan",12)
    val customer2 = Customer("Srijan",15)
    println(customer)
    println(customer2)
    println(customer == customer2)
    println(customer.component2())


}