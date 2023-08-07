object caesar{

    val Ualphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val Lalphabet = Ualphabet.toLowerCase()

    //shifting
    def shiftChar(c: Char, shiftedLAlphabet: String, shiftedUAlphabet: String, Ualphabet: String, Lalphabet: String): Char ={
        if (c.isLetter) {
            if (c.isUpper) { shiftedUAlphabet(Ualphabet.indexOf(c)) }
            else { shiftedLAlphabet(Lalphabet.indexOf(c)) }
        }
        else { c }
    }

    //decrypt
    def uncaesar(s: String, shift: Int) = {

        val shiftedUAlphabet = Ualphabet.substring(26 - shift) + Ualphabet.substring(0, (26 - shift))
        val shiftedLAlphabet = shiftedUAlphabet.toLowerCase()

        s.map(shiftChar(_,shiftedLAlphabet, shiftedUAlphabet, Ualphabet, Lalphabet))
    }

    //encrypt
    def caesar(s: String, shift: Int) = {
        val shiftedUAlphabet = Ualphabet.substring(shift) + Ualphabet.substring(0, shift)
        val shiftedLAlphabet = shiftedUAlphabet.toLowerCase()

        s.map(shiftChar(_,shiftedLAlphabet, shiftedUAlphabet, Ualphabet, Lalphabet))
    }

    //common cipher func
    def cipher(s: String, shift: Int)(cipherFunc: (String, Int) => String): String = { cipherFunc(s, shift) }
    
    def main(args: Array[String]): Unit = {
        val s = "HELLO, world"
        val shift =3
        val result = cipher(s, shift%26)(caesar)
        println(result)
        val unresult = cipher(result, shift%26)(uncaesar)
        println(unresult)

    }
}
