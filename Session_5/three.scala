object three{
    def sum (x:Int):Int = x match{
        case x if (x==1) => 1
        case _ => x + sum(x-1)
    }

    def main(args: Array[String]): Unit = {

    println(sum(5))
    
    }
}