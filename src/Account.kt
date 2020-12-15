import java.util.*

class Account {
    private var accountHolderName:String
    private var balance:Double
    private var accountNumber:Long
    private var emailId:String? = null
    private var phoneNumber: Long? = null
    private var statement:MutableList<Transaction> = mutableListOf()
    private var interestRate:Float=0.0f
    private var typeOfAccount:TypeOfAccount

    constructor(typeOfAccount:TypeOfAccount,accountHolderName:String,balance:Double,nextAccNum:Long){
        this.typeOfAccount=typeOfAccount
        this.accountHolderName=accountHolderName
        this.balance=balance
        this.accountNumber=nextAccNum

    }
    fun deposit(amount:Double){
        this.balance+=amount
        statement.add(Transaction(Date(),amount,TypeOfTransaction.DEPOSIT))
        println(statement)
    }
    fun withdraw(amount: Double){
        this.balance-=amount
        statement.add(Transaction(Date(),amount,TypeOfTransaction.WITHDRAW))

    }
    fun setEmailId(emailId:String) {
        this.emailId=emailId
    }
    fun setPhoneNumber(phoneNumber:Long){
        this.phoneNumber=phoneNumber
    }




}