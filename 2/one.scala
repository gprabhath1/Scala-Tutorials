object one{
    def a (k: Int, m: Int): Int = k+(12*m)

    def b (m: Int, j: Int): Double = m/j

    def c1 (n: Int, j: Int): Double = n%j
    
    def d1 (m: Int, j: Int): Double = m/j*j

    def e (f: Double, g: Double): Double = f+10*5+g

    def f1(i: Int, n: Int): Int =(i+1)*n

    def main(args: Array[String]): Unit = {
        var (k,i,j) = (2,2,2)
        var (m,n)=(5,5)
        var f :Double=12.0
        var g :Double=4.0
        var c='X'

        println(a(k,m))
        println(b(m,j))
        println(c1(n,j))
        println(d1(m,j))
        println(e(f,g))
        println(f1(i,n))
    }
}