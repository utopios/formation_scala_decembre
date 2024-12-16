import scala.io.StdIn.readLine

object Program {

  val menu = Map(
    "P1" -> ("Pizza Margherita", 12.0),
    "P2" -> ("Burger Classique", 10.0),
    "P3" -> ("Salade César", 8.0),
  )

  def afficherMenu() = {
    println(" Menu du restaurant : ")
    for((code, (nom, prix)) <- menu) {
      println(s"[$code] $nom - $prix €")
    }
    println()
  }

  def prendreCommande(): List[String] = {
    var commande: List[String] = List()
    var codePlat:String = ""
    println("Entrez le code du plat  (FIN pour terminer): ")
    do {
      codePlat = readLine().toUpperCase
      if(menu.contains(codePlat)) {
        commande = commande :+ codePlat
        println(s"Vous avez ajouté ${menu(codePlat)._1} à votre commande")
      } else if(codePlat != "FIN") {
        println("Code plat invalide")
      }
    }while(codePlat != "FIN")
    commande
  }

  def calculerTotal(commande: List[String]): Double = {
    /*val total = commande.map(code => menu(code)._2).sum
    total*/
    commande.map(code => menu(code)._2).sum
  }

  def appliquerReductions(total: Double, pourcentage: Int): Double = {
      total * (1 - pourcentage.toDouble / 100.00)
  }

  def aficherFacture(commande:List[String], totalAvantReduction:Double, pourcentage:Int) = {
    println("Votre commande : ")
    for(code <- commande) {
      val (nom, prix) = menu(code)
      println(f"- $nom : $prix%.2f €")
    }
    println("======== Facture =========")
    println(f"Nombre de plats commandés : ${commande.size}")
    println(f"Total avant réduction : $totalAvantReduction%.2f €")
    println(f"Montant de la réduction : ${totalAvantReduction * pourcentage / 100}%.2f €")
    println(f"Total à payer : ${appliquerReductions(totalAvantReduction, pourcentage)}%.2f €")
  }

  def main(args: Array[String]): Unit = {
    afficherMenu()
    val commande = prendreCommande()
    println("Entrez le pourcentage de la réduction: ")
    val pourcentage = readLine().toInt
    aficherFacture(commande,calculerTotal(commande), pourcentage)
  }
}
