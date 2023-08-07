import scala.math.Pi

object area {
  def main(args: Array[String]): Unit = {

    def calculateDiskArea(radius: Double): Double = Pi * radius * radius

    val area = calculateDiskArea(5.0)
    println("area of a disk with radius 5 = " + area)
  }
}