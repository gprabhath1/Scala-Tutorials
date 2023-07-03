object two{
    def fives(list: List[String]): List[String] = {
        list.filter(_.length > 5)
    }

    def main(args: Array[String]): Unit={ 

        val list1 = List("Hello..", "My", "Name", "Is", "Geethika")
        val list2 = fives(list1)
        println(list1)
        println(list2)
    }
}