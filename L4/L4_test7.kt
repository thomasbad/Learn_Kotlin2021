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
    print("Account 1 Balance: ")
    println(myAccount.accountBalance)
    myAccount.accountBalance = 8888.8
    print("Account 1 lastest Balance: ")
    println(myAccount.accountBalance)
    print("Account 2 lastest Balance: ")
    println(myAccount2.accountBalance)
}

class BankAccount{
    // properties = variables
    // methods = functions
    var accountBalance: Double = 0.0
    var accountNumber: Int = 0
}