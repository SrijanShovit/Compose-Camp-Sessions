package Abstraction

abstract class LoanScheme {
    abstract fun calcInterest()
    //show them abstarct nhi dene se kya hoga
//    fun calcInterest(p:Int,r:Int,t:Int)
    abstract fun repayLoan()
}

class SBI:LoanScheme(){
    private val p = 500000
    private val r = 7.2
    private val t = 4


    override fun calcInterest() {
        var interest:Double=0.0;
        for (i in 1..4){
            interest += p*r*t*t;
        }
        println("Amount to be paid: ${p+interest}")
    }

    override fun repayLoan() {
        println("Start paying after 4 years")
    }


}

class DRCC:LoanScheme(){
    private val p = 500000
    private val r = 7.2
     private val t = 4
    override fun calcInterest() {
        val interest= p*r*t;
        println("Total amount: ${p+interest}")
    }

    override fun repayLoan() {
        println("You have to keep paying 1000 each month until paid entire amount")
    }
}

fun main(){
//    val bank1 = LoanScheme() //error
    val sbi = SBI()
    sbi.calcInterest()
    sbi.repayLoan()

    val drcc = DRCC()
    drcc.calcInterest()
    drcc.repayLoan()

}