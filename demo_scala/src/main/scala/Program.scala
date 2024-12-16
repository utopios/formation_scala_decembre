import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

object Program {
  def main(args: Array[String]): Unit = {
    /*println("Hello world")
    val readOnlyVar = "value of val"
    println(readOnlyVar)
    println(readOnlyVar.getClass().getName())
    var readAndWriteVar: Int = 40
    println(readAndWriteVar)
    println(readAndWriteVar.getClass().getName())
    readAndWriteVar = 43
    println(readAndWriteVar)
    // readOnlyVar = "test" -> pas possible

    for(i <- 1 until  10 if i%2 == 0) {
      //if(i % 2 == 0)
        println(i)
    }*/
    /*breakable {
      for (i <- 1 to 10; j <- 10 to 1 by -1) {
        if ((j * i) % 4 == 0)
          break
        println(s"i=$i, j=$j")
      }
    }*/

    //var evenNumbers = for(i <-1 to 10 if i%2 == 0) yield i
    //println(evenNumbers.toList)
    val input = StdIn.readLine("Entrez quelque chose : ")
    println(input.toInt)
  }
}
