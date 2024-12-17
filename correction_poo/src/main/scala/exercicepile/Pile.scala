package exercicepile

import scala.collection.mutable.ListBuffer

class Pile[T] {
  private val elements: ListBuffer[T] = ListBuffer()

  def push(element: T): Unit = {
    elements.prepend(element)
  }

  def pop(): Option[T] = {
    if(elements.isEmpty) None
    else Some(elements.remove(0))
  }

  def top(): Option[T] = {
    if(elements.isEmpty) None
    else Some(elements(elements.size-1))
  }

}
