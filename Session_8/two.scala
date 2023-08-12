object two {
    val classifyNumber: (Int) => Unit = (num) => num match {
        case n if num <= 0 => println("Input is Negative/Zero")
        case n if num % 2 == 0 => println("Input is Even")
        case _ => println("Input is Odd")
    }

    def main(args: Array[String]): Unit = {

        val input = args(0).toInt
        classifyNumber(input)

    }
}
