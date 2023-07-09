object two{
   def isprime(p: Int, i: Int = 2): Boolean = {

        p match{
        case x if (p ==1 ) => true
        case x if (x == i) => true
        case x if (p%i == 0) => false
        case _ => isprime(p,i+1)
        }
    }

    def primeseq(n: Int){
        if (n>2) primeseq(n-1)
        if (isprime(n)) println(n)
    }

    def main(args: Array[String]): Unit = {

    primeseq(10)
    
    }
}