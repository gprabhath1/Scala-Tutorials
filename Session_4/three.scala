object three{
  def toUpper(name:String) : String = name.toUpperCase
  def toLower(name:String) : String = name.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)
    
    
  def main(args: Array[String]): Unit={

    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Kumara"
    val name4 = "Saman"

    println(formatNames(name1)(toUpper))
    println(formatNames(name2.take(2))(toUpper) + formatNames(name2.drop(2))(toLower))
    println(formatNames(name4)(toLower))
    println(name3.dropRight(1) + formatNames(name3.takeRight(1))(toUpper))
  }
}