import scala.math.Pi

object calcvol{
    def main(args: Array[String]): Unit = {

        def calcVolume(radius: Double): Double = {
            (4.0 / 3.0) * Pi * radius * radius * radius
        }

        val volume = calcVolume(5.0)
        println("The volume of a sphere with radius 5 is " + volume)
    }
}