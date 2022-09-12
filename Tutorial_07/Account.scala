    class Account(nic:String, val accId: Int, var accBalance: Double = 0.0){

        def withdrow(amount:Double) : Unit = {
            this.accBalance = this.accBalance - amount
        }

        def deposit(amount:Double) : Unit = {
            this.accBalance = this.accBalance + amount
        }

        def transfer(account:Int, amount:Double) : Unit = {
          val transferAcc = Q4.find(account, Q4.accountList)

          if (accaBalance < 0.0) println("Insufficient balance")

          else {
              this.withdrow(amount)
            }
                transferAcc(0).deposit(amount)
        }

        override def toString = "["+nic+":"+accId +":"+ accBalance+"]"
    }
