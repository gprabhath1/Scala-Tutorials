object tempconv{
    def main(args: Array[String]): Unit = {
        def celsiusToFahrenheit(celsius: Double): Double = celsius * 1.8 + 32.0
            
        

        val fahrenheit = celsiusToFahrenheit(35.0)
        print("The temperature 35°C is " + fahrenheit + "°F in fahrenheit")
    }
}