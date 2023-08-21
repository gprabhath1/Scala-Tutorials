class Account(initialBalance: Double) {
  var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def withdraw(amount: Double): Boolean = {
    if (balance >= amount) {
      balance -= amount
      true
    } else {
      false
    }
  }

  def transfer(amount: Double, targetAccount: Account): Boolean = {
    if (withdraw(amount)) {
      targetAccount.deposit(amount)
      true
    } else {
      false
    }
  }

  def applyInterest: Unit = {
    if (balance > 0) {
      balance *= 1.05
    } else {
      balance *= 1.1
    }
  }

  def getBalance: Double = balance
}

class Bank(newaccounts: List[Account]) {
  var accounts: List[Account] = newaccounts

  def getNegativeBalance: List[Account] = accounts.filter(account => account.getBalance < 0)

  def getTotalBalance: Double = accounts.map(_.getBalance).sum

  def applyInterestToAccs: Unit = accounts.foreach(_.applyInterest)

  def getAllAccountBalances: List[Double] = accounts.map(_.balance)

}


object two extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(500.0)

  println("Account 1 balance: " + account1.getBalance)
  println("Account 2 balance: " + account2.getBalance)

  account1.deposit(200.0)
  println("Account 1 balance: " + account1.getBalance)

  account2.withdraw(100.0)
  println("Account 2 balance: " + account2.getBalance)

  account1.transfer(300.0, account2)
  println("Account 1 balance: " + account1.getBalance)
  println("Account 2 balance: " + account2.getBalance)

  val account3 = new Account(-200.0)
  val account4 = new Account(-400.0)

  val bank = new Bank(List(account1, account2, account3, account4))

  println("Accounts with negative balances:")
  bank.getNegativeBalance.foreach(account => println(account.getBalance))

  println("Total balance of all accounts: " + bank.getTotalBalance)

  println("Balances after applying interest:")
  bank.applyInterestToAccs
  println(bank.getAllAccountBalances)

}
