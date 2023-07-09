object five{

    def evensum (x:Int, i:Int = 2):Int = x match{
        case x if (i>=x) => 0
        case _  => i + evensum(x,i+2)
    }

    def main(args: Array[String]): Unit = {
        println(evensum(6))

    }
}