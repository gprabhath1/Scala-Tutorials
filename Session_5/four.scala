object four{
    def iseven(n:Int):Boolean= n match{
        case 0 => true
        case 1 => false
        case _ => iseven(n-2)
    }

    def isodd(n:Int):Boolean = n match{
        case 0 => false
        case 1 => true
        case _ => isodd(n%2)
    }

    def main(args: Array[String]): Unit = {
    println(isodd(8))
    println(isodd(5))
    println(isodd(0))
    println(isodd(1))
    }
}