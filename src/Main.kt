fun main(){
    val bank=Bank()
    bank.createAccount(TypeOfAccount.SAVINGS,"Adam",1000.0)
    bank.createAccount(TypeOfAccount.CURRENT,"John",500.0)
    bank.deposit(1,100.0)
    bank.setEmailId(3,"a@gmail.com")



}