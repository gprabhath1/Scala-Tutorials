object three{
    def mean(num1: Int, num2: Float): Float = {
        roundIt((num1+num2)/2.0f)
    }

    def roundIt(num: Float): Float = {
        (num*100).round / 100.0f
    }

    def main(args: Array[String]): Unit={ 

        val (num1, num2) = (5, 4.9876f)
        val numMean = mean(num1, num2)
        println(numMean)
    }
}