object RepeatedWord extends App {
  val string = "Knol is a unit of Knowledge & Dus comes from Druksh which is Sanskrit for a tree, hence Knoldus is a tree of Knowledge."

  println(findRepeatedWord(string))

  println(List(1, 1, 2, 1).toSet) // remove repeated elements from list

  def findRepeatedWord(string: String) = {
    val list = string.toLowerCase.split(" ").toList
    val result = list.map {
      char =>
        val count = list.count(_ == char)
        Map(char -> count)
    }.distinct.flatten

    result.filter(wordCount => wordCount._2 > 1).map(wordCount => wordCount._1)
  }
}
