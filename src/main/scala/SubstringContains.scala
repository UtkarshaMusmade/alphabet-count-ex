object SubstringContains extends App {
  val string = "Knol is a unit of Knowledge & Dus comes from Druksh which is Sanskrit for a tree, hence Knoldus is a tree of Knowledge."
  val vector = string.toLowerCase.split(" ").toVector
println(vector.contains("knol"))
  println(vector.contains("knolrr"))

}
