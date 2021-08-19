fun main() {
    var i: Int = 0
    var account1: BankAccount = BankAccount()
    account1.displayBalance()
    
    var account2: BankAccount = BankAccount(2345, 88.8)
    account2.displayBalance()
    
    var account3: BankAccount = BankAccount(3456)
    account3.displayBalance()
    
    var cAccount = CurrentAccount(){
        cAccount.displayBalance()
        cAccount.accountBalance = 9999.0
        cAccount.displayBalance()
    }
    
}

open class BankAccount{
    // properties members
    var accountBalance: Double = 0.0
    var accountNumber: Int = 0

    //contructor - special function to initalize the object
    constructor(number: Int, balance: Double){
        accountBalance = balance
        accountNumber = number
    }
    
    constructor(){
        accountBalance = 100.0
        accountNumber = 1234
    }
	
    constructor(balance: Double){
        accountBalance = balance
        accountNumber = 111
    }
    
    constructor(number: Int){
        accountBalance = 0.5
        accountNumber = number
    }
    
    // methods members
    open fun displayBalance(){
        println("===Account Details===")
        println("Account Number: $accountNumber")
        println("Account Balance: $accountBalance")
        println()
    }
}

class CurrentAccount: BankAccount{
    constructor(){
        println("Current Account constructor called")
    }
    
    override fun displayBalance(){
        println("=== displayBalance in CurrentAccount ===")
        super.displayBalance()
        println("Overdraw Amount: $overdrawAmount")
    }
}