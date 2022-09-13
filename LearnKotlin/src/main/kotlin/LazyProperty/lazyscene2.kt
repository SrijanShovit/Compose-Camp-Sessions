package LazyProperty


private const val THRESHOLD = 500000
private val simplePayment = SimplePayment()

//val scholarshipPayment = ScholarshipPayment()

private val scholarshipPayment by lazy{
    ScholarshipPayment()
}

fun main(){

    val incomes = listOf(700000,800000,900000)

    for (income in incomes){
        simplePayment.verifyPayment()
        if (income < THRESHOLD) scholarshipPayment.verifyIncome(income)
    }

}

class SimplePayment{
    fun verifyPayment(){
        println("verified payment")
    }
}

class ScholarshipPayment{
    constructor(){
        for(i in 1..100000)
            println("Isme time lagega")
    }

    fun verifyIncome(income:Int){
        println("verified income")
    }

}
