object CheckPallindrom extends App {
  val string = "jasaj"
  println(isPallindrom(string))

  def isPallindrom(string: String) = {
    string.reverse.equals(string)
  }
}
