object AlphabetCount extends App {
  val string = "Knol is a unit of Knowledge & Dus comes from Druksh which is Sanskrit for a tree, hence Knoldus is a tree of Knowledge."

  println(characterCount(string))
  println(wordContainAlphabates(string, 2))

  private def characterCount(string: String) = {
    val list = string.replace(" ", "").toLowerCase.toList

    list.map {
      char =>
        val count = list.count(_ == char)
        Map(char -> count)
    }.distinct.flatten

  }

  def wordContainAlphabates(string: String, n: Int) = {
    val alphabetOccurence = characterCount(string)
    val mapOfNOccurences = alphabetOccurence.filter {
      keyValue => keyValue._2 == n
    }
    mapOfNOccurences.map { alphabets => alphabets._1
    }.filter(char => char.isLetter).mkString
  }
}
