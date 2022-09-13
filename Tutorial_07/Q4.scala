object Q4 extends App {

  var accountList:List[Account] = List()

  def createAcc(nic:String, accId: Int):Unit = {
    val acc = new Account(nic, accId)
    accountList = accountList ::: acc :: Nil
  }

  val find = (id:Int, accList:List[Account]) => accList.filter(account => account.accId.equals(id))
  val overdraft = (accList:List[Account]) => accList.filter(account => account.accBalance < 0.0)
  val totalBalance = (accList:List[Account]) => accList.foldLeft(0.0)((x, y) => x + y.accBalance)
  val interest = (accList:List[Account]) => accList.map(account => if(account.accBalance > 0) {account.accBalance*0.05} else {account.accBalance*0.1})

  createAcc("001",1)
  createAcc("002",2)
  println(accountList)

  find(1, accountList)(0).deposit(10000)
  println(find(1, accountList)(0))

  find(1, accountList)(0).transfer(2, 10100.0)
  println(accountList)
  find(1, accountList)(0).transfer(2, 100.0)
  println(accountList)

  println(overdraft(accountList))

  println(totalBalance(accountList))

  println(interest(accountList))

}
