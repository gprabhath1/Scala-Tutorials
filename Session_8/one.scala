object one {
  val interestFunction: (Int) => Double = (deposit) => deposit match {
    case n if n <= 20000 => n * 0.02
    case n if n <= 200000 => n * 0.04
    case n if n <= 2000000 => n * 0.035
    case _ => deposit * 0.065
  }

  def main(args: Array[String]): Unit = {
    val deposit1 = 15000
    val deposit2 = 100000
    val deposit3 = 500000
    val deposit4 = 2500000

    val x = interestFunction
    
    println("Interest for Rs. " + deposit1 + " deposit: Rs." + x(deposit1))
    println("Interest for Rs. " + deposit2 + " deposit: Rs." + x(deposit2))
    println("Interest for Rs. " + deposit3 + " deposit: Rs." + x(deposit3))
    println("Interest for Rs. " + deposit4 + " deposit: Rs." + x(deposit4))

  }
}
