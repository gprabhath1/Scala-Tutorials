object two {
  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(w => w.length)
    letterCounts.reduce((a, b) => a + b)

  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    println(" Total count of letter occurrences: " + countLetterOccurrences(words))
  }
}
