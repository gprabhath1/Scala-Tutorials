object calcwholesale{
    def main(args: Array[String]): Unit = {

        def calculateShippingCost(num: Double): Double = {
            if (num <= 50) {
                num * 3.0
            } else {
                50 * 3.0 + (num - 50) * 0.75
            }
        }

       def calculateWholesaleCost(num: Double): Double = {  
            ((24.95 * num) + calculateShippingCost(num)) * (1 - 0.4)
        }

        val num = 60
        val totalCost = calculateWholesaleCost(60.0)
        print("The total wholesale cost for 60 copies is Rs." + totalCost)
    }
}