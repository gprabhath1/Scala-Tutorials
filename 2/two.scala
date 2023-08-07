object two{
    def inc(x: Int): Int = x+1
    def dec(x: Int): Int = x-1

    def a1(b: Int, a: Int, c: Int, d: Int): Int = (b*a) + (c*d)

    def c1(g: Float, k: Float, c: Int): Float = -2*(g-k)+c

    def main(args: Array[String]): Unit = {

        
        var (a,b,c,d) = (2,3,4,5)
        var k: Float = 4.3f
        var g :Float=4.0f

        //b=inc(b)
        println(a1(dec(b),a,c,dec(d)))
        println(inc(a))
        println(c1(g,k,c))
        c=inc(c); println(c)
        c=inc(c)*inc(a); println(c)



    }
}