object one {
  def calculateAverage(cTemperatures: List[Double]): Double = {
    val fTemperatures = cTemperatures.map(t => (t * 9/5) + 32)
    fTemperatures.reduce((a, b) => a + b) / cTemperatures.length

  }

  def main(args: Array[String]): Unit = {
    val cTemperatures = List(0.0, 10.0, 20.0, 30.0)
    println("Average Fahrenheit temperature: " + calculateAverage(cTemperatures))
  }
}
