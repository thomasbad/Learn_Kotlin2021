fun main() {
    var i: Int = 0
    var a1: BankAccount = BankAccount(6789, 1000.0)
    a1.displayBalance()
    a1.deposit(100.0)
    a1.displayBalance()
    a1.withdraw(50.0)
    a1.displayBalance()
}

open class BankAccount {
    // property members
    var accountBalance: Double = 0.0
    var accountNumber: Int = 0

    constructor() {
        accountBalance = 100.0
        accountNumber = 1234
    }
    
    constructor(number: Int) {
        // chain up constructor
        accountBalance = 0.5
        accountNumber = number
    }
    
    constructor(number: String) {
        println("THIS constructor is used")
    }
    
    constructor(number: Int, balance: Double) {
        accountBalance = balance
        accountNumber = number
    }
    
    
    // method members: withdraw(), deposit(), transfer()

	fun withdraw(amount: Double) {
        println("withdraw() is called")
        accountBalance = accountBalance - amount
    }   
    
    fun deposit(amount: Double) {
        println("deposit() is called")
        accountBalance = accountBalance + amount
    }
    
    fun transfer() {
        println("transfer() is called")
    }
    
    open fun displayBalance() {
        println("=== Account Details ===")
        println("Number: $accountNumber")
        println("Balance: $accountBalance")
        println()
    }   
}

class CurrentAccount: BankAccount {
    var overdrawAmount: Double
    
    constructor() {
        println("Current Account constructor called")
        overdrawAmount = 10000.0
    }
    
    override fun displayBalance() {
        println("=== displayBalance in CurrenctAccount ===")
		super.displayBalance()
        println("Overdraw Amount: $overdrawAmount")
    }
}