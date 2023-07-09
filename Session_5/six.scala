object six{

    def fibbonacci (x:Int):Int = x match{
        case 0 => 0
        case 1 => 1
        case _  => fibbonacci(x-1) + fibbonacci(x-2)
    }

    def prfibbonacci(n:Int) {
        if (n > 0) prfibbonacci(n-1)
        println(fibbonacci(n))
    }

    def main(args: Array[String]): Unit = {
        prfibbonacci(6)
    }
}