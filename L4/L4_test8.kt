//Example of Kotlin Class 2 (constructor)

fun main() {
    // var age: Int = 10
    // var salary: Double =10000.5
    // var salary2: Double = 20000.8
    // println(salary.toInt())
    // println(salary2.toInt())

    //sample start from here
    var myAccount: BankAccount = BankAccount(1111, 100.0)
    var myAccount2: BankAccount = BankAccount(2222, 200.2)
    var myAccount3: BankAccount = BankAccount(3333, 300.3)
    myAccount.printAccountDetails()
    myAccount2.printAccountDetails()
    myAccount3.printAccountDetails()
}

class BankAccount{
    // properties = variables
    // methods = functions

    // properties members
    var accountBalance: Double = 0.0
    var accountNumber: Int = 0

    //contructor - special function to initalize the object
    constructor(number: Int, balance: Double){
        println("contructor() is called")
        accountBalance = balance
        accountNumber = number
    }

    // methods members
    fun printAccountDetails(){
        println("============================================")
        println("Account Number: $accountNumber")
        println("Account Balance: $accountBalance")
        println("============================================")
    }
}