object four{
    def revenue(price: Int, attendees: Int): Int = price*attendees

    def cost(attendees: Int): Int = 500 + attendees*3

    def profit(rev: Int, c: Int): Int = rev - c

    def max(p1: Int, p2: Int, p3: Int): Int = {
        if (p1 < p2){
            if (p2 < p3) 10
            else 20
        }
        else{
            if (p1 > p3) 15
            else 10
        }
    }

    def main(args: Array[String]): Unit = {

    val p1 = profit(revenue(15, 120), cost(120))
    val p2 = profit(revenue(20, 100), cost(100))
    val p3 = profit(revenue(10, 140), cost(140))

    println("Best ticket price: " + max(p1, p2, p3))
    }
}