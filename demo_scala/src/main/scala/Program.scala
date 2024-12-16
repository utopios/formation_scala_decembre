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
    //val input = StdIn.readLine("Entrez quelque chose : ")
    //println(input.toInt)
    /*sayHello(37,"Ihab")
    sayHello(33)
    addition(10,30)

    val carre = (a:Int) => a * a
    val doubleOfElement = (_:Int) * 2
    println(carre(20))
    println(doubleOfElement(20))

    var element:Any = 10

    println(analyse(element))
    element = "test"
    println(analyse(element))

    var maListe = List(3,4,5, "test")
    maListe.map(x => {
      println(x)
    })

    var monSet = Set(1,2,2, "test", "test")
    monSet.map(e => println(e))

    var monMap = Map("cle" -> "value", "cle2" -> "value2", 34 -> true)
    monMap.map { case (key, valeur) => println(s"Cle : $key, Valeur : $valeur") }

    for((key,  valeur) <- monMap) {
      println(s"Cle : $key, Valeur : $valeur")
    }*/

    /// #### POO
    val p1 = new Person("ihab", 37)
    p1.afficher()

  }

  def analyse(element:Any): String = {
    element match {
      case i:Int => "Its integer"
      case s:String => "Its String"
      case _ => "Other type"
    }
  }

  def sayHello(age:Int = 10, name: String = "toto"): Unit = {
    println(s"Hello from our function to $name")
  }

  def addition(a:Int, b:Int) = a+b
}
