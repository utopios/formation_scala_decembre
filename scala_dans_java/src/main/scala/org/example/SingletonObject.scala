package org.example

object SingletonObject {
  def greet() = println("Hello From singleton object")

  def greetUser(name: Option[String]): Unit = {
    name match {
      case Some(value) => println(s"Hello, $value!")
      case None => println("Hello, unknown user!")
    }
  }

  def printList(data:List[String]) = {
    data.foreach(e => println(e))
  }

  def printTuple(data:(String, String)) = {
    println(data._1)
    println(data._2)
  }
}
