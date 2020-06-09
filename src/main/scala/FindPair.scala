import scala.collection.mutable

object FindPair extends App {
  val hashSet = new mutable.HashSet[Int]
  val listBuffer = new mutable.ListBuffer[(Int,Int)]
  findPair(List(8, 7, 2, 5, 3, 1), 10)
  def findPair(list: List[Int], sum: Int) = {
    list.map {
      element =>if(hashSet.contains(sum-element)) listBuffer.addOne((sum-element,element)) else
        hashSet.add(element)
    }
  }
  println(listBuffer)

}
