object AlphabetCount extends App {
  val string = "Knol is a unit of Knowledge & Dus comes from Druksh which is Sanskrit for a tree, hence Knoldus is a tree of Knowledge."

  println(characterCount(string))
println(alphabetCount(string))
  private def characterCount(string: String) = {
    val list = string.replace(" ", "").toList
   list.map {
      char =>
        val count = list.count(_ == char)
        Map(char -> count)
    }
  }

  def alphabetCount(string: String)={
   val list = string.split(" ").toList
    list.map{
      word =>word
    }
  }
}
