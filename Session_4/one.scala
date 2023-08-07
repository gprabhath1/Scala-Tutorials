object one{
    def interest(deposit:BigDecimal) = deposit match{
        case x if deposit <= 20000 => x*0.02
        case x if deposit <= 200000 => x*0.04
        case x if deposit <= 2000000 => x*0.035
        case x if deposit >= 20000000 => x*0.065
    }
    
    def main(args: Array[String]): Unit={
        print("Enter deposit: ")
        val number = scala.io.StdIn.readLine()
        val deposit = scala.math.BigDecimal(number)
        println("Interest for " + deposit + " = " + interest(deposit))
    }
}
