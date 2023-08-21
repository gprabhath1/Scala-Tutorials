class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def number = n
    def denom = d

    def neg = new Rational(-this.number, this.denom)
    def sub(r:Rational) = new Rational(this.number*r.denom - this.denom*r.number, this.denom*r.denom)
    def -(r:Rational) = this.sub(r)

    override def toString(): String = number + "/" + denom
}

object two extends App {
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)

    println(x)
    println(x.neg)

    val a = x-y-z
    println(a)
}

