class Bank {
   private var nextAccNum:Long=1
   private  var accounts = mutableMapOf<Long,Account>()

   fun createAccount(typeOfAccount: TypeOfAccount,accountHolderName:String,initialBalance:Double){

      val account=Account(typeOfAccount,accountHolderName,initialBalance,nextAccNum)
      accounts[nextAccNum] = account
      nextAccNum++


   }

   fun deposit(accountNumber:Long,amount:Double){
      accounts[accountNumber]?.deposit(amount)
   }

   fun withdraw(accountNumber:Long,amount:Double){
      accounts[accountNumber]?.withdraw(amount)

   }
   fun setEmailId(accountNumber:Long,emailId:String){
      accounts[accountNumber]?.setEmailId(emailId)
   }
   fun setPhoneNumber(accountNumber: Long,phoneNumber:Long){
      accounts[accountNumber]?.setPhoneNumber(phoneNumber)
   }


}