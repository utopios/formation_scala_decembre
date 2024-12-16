import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

object TP2 {
  var formation = mutable.Map(
    "F1" -> ("Java", 10, 500),
    "F2" -> ("Python", 8, 450),
    "F3" -> ("Data Science", 5, 800),
  )


  def displayFormation(): Unit = {
    for((num, (langage, place, prix)) <- formation){
      println(s"[$num]  Formation $langage ($place places disponibles) - $prix")
    }
  }
  def checkPlace(num: String): Boolean = {
    formation(num)._2 > 0
  }
  def removePlace(num: String) :Unit = {
    val newTuple =  (formation(num)._1, formation(num)._2 - 1,formation(num)._3 )
    formation(num) = newTuple
  }
  def calculFrais(session: mutable.Map[String, ListBuffer[(String, String)]]): Double = {
    session.map{
      case(num,inscripts) => formation(num)._3 * inscripts.size
    }.sum
  }
  def afficherResumeFacture(session: mutable.Map[String, ListBuffer[(String, String)]]) = {
    print(" **Résumé des Inscriptions** ")
    session.foreach {
      case (num, inscript) => inscript.foreach(s => println(s"${s._1} a rejoint la formation ${formation(num)._1}"))
    }
    println("Facture d'Inscriptio")
    session.foreach {
      case (num, inscript) => {
        var prix = formation(num)._3 * inscript.size
        println(s"- Formation ${formation(num)._1} : $prix ")
      }
        println("**Total à payer** : " + calculFrais(session))
    }
  }
  def inscrireCandidat() = {
    //buffer mutable list
    var sessions: mutable.Map[String, ListBuffer[(String, String)]] = mutable.Map()
    formation.foreach{
      case(nom, _) => sessions += ((nom, ListBuffer.empty[(String, String)]))
    }
    var numSession = "";
    do {
      println("Entrez le code de la formation à laquelle vous souhaitez vous inscrire (ou FIN pour quitter) :")
      numSession = readLine().toUpperCase();
      if(formation.contains(numSession)){
        if(checkPlace(numSession)){
          removePlace(numSession)
          println("Entrez le nom:")
          var nom = readLine()
          println("Entrez l'email")
          var email = readLine()
          sessions(numSession).append((nom, email))
        } else {
          println("COMPLET - Choisissez une autre formation (ou FIN pour quitter) :")
        }
      } else if (numSession != "FIN"){
        println( "invalid")
      }
    } while (numSession != "FIN")
    sessions
  }



  def main(args: Array[String]): Unit = {
    displayFormation()
    var session = inscrireCandidat()
    afficherResumeFacture(session)
  }
}
