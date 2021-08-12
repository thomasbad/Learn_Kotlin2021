//Example of Kotlin Class

fun main() {
    // var age: Int = 10
    // var salary: Double =10000.5
    // var salary2: Double = 20000.8
    // println(salary.toInt())
    // println(salary2.toInt())

    //sample start from here
    var myAccount: BankAccount = BankAccount()
    var myAccount2: BankAccount = BankAccount()
    myAccount.accountNumber = 1111
    myAccount.accountBalance = 8888.8
    myAccount.printAccountDetails()
    myAccount2.printAccountDetails()
}

class BankAccount{
    // properties = variables
    // methods = functions

    // properties members
    var accountBalance: Double = 0.0
    var accountNumber: Int = 0

    // methods members
    fun printAccountDetails(){
        println("============================================")
        println("Account Number: $accountNumber")
        println("Account Balance: $accountBalance")
        println("============================================")
    }
}