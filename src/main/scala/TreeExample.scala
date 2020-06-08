
case class Node(left: Option[Node], data: Int, right: Option[Node])

object TreeExample {

  def preOrder[A](treeNode: Node): Unit = {
    print(treeNode.data)
    if (treeNode.left.isDefined) preOrder(treeNode.left.get)
    if (treeNode.right.isDefined) preOrder(treeNode.right.get)
  }

  def postOrder[A](treeNode: Node): Unit = {
    if (treeNode.left.isDefined) postOrder(treeNode.left.get)
    if (treeNode.right.isDefined) postOrder(treeNode.right.get)
    print(treeNode.data)
  }

}

object TreeTraversal extends App {
  TreeExample.preOrder(Node(
    Some(
      Node(
        Some(Node(Some(Node(None, 6, None)), 4, None)),
        2,
        Some(Node(None, 5, None))
      )
    ),
    1,
    Some(Node(None, 3, None))
  ))
}