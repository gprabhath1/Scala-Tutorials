object one{
    def rvs(str:String):String={
        if(str.length==1) str
        else rvs(str.tail)+str.head
    }

    def main(args: Array[String]): Unit={ 

        var str="Hellopop"
        str = rvs(str)
        println(str)
    }
}