object calcruntime{
    def main(args: Array[String]): Unit = {

        def calculateRunningTime(easyPace: Double, tempoPace: Double, easyDistance: Double, tempoDistance: Double): Double = {
            val easyTime = easyPace * easyDistance
            val tempoTime = tempoPace * tempoDistance
            2*easyTime + tempoTime
        }


        val easyPace = 8.0 
        val tempoPace = 7.0 
        val easyDistance = 2.0 
        val tempoDistance = 3.0 

        val totalTime = calculateRunningTime(easyPace, tempoPace, easyDistance, tempoDistance)
        println("The total running time is " + totalTime + " minutes")

    }
}