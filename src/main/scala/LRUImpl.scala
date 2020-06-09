import sun.misc.LRUCache

import scala.collection.immutable.Queue
import scala.collection.mutable

class LRUCache(val size: Int) {
  val cache = new mutable.LinkedHashSet[Int]

  def addElement(element: Int) = {
    if (!cache.contains(element)) {
      if (cache.size == size) {
        val firstKey = cache.iterator.next();
        cache.remove(firstKey)
      }
      cache.add(element)
    } else {
      cache.remove(element)
      cache.add(element)
    }
  }

  def display = {
    println(cache)
  }
}

object LRUCache extends App {
  val lru = new LRUCache(3)
  lru.addElement(1)
  lru.addElement(2)
  lru.addElement(3)
  lru.addElement(1)
  lru.addElement(4)
  lru.addElement(1)
  lru.display
}