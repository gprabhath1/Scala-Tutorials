object three{
    def salary(nhrs: Int, othrs: Int): Double = ((250*nhrs)+(othrs*85))*(1-0.12)
    
    def main(args: Array[String]): Unit = {
        println(salary(40,30))
    }
}