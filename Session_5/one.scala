object one{
   def isprime(p: Int, i: Int = 2): Boolean = {

        p match{
        case x if (p ==1 ) => true
        case x if (x == i) => true
        case x if (p%i == 0) => false
        case _ => isprime(p,i+1)
        }

    }

    def main(args: Array[String]): Unit = {

    println(isprime(1))
    println(isprime(2))
    println(isprime(3))
    println(isprime(4))
    println(isprime(5))
    println(isprime(6))
    println(isprime(7))
    println(isprime(8))
    println(isprime(9))
    println(isprime(10))
    println(isprime(11))
    
    }
}