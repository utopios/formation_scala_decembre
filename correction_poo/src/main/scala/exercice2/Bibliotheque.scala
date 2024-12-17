package exercice2

import scala.collection.mutable.ListBuffer

class Bibliotheque {
  private var listeLivres: ListBuffer[Livre] = ListBuffer()

  def ajouterLivre(livre: Livre): Unit = {
    listeLivres += livre
    println(s"Le livre ${livre.titre} a été ajouté à la bibliothèque.")
  }


  def listerLivresDisponibles(): List[Livre] = {
    val livresDisponibles = listeLivres.filter(_.disponible).toList
    println("Livres disponibles: " + livresDisponibles.map(_.titre).mkString(", "))
    livresDisponibles
  }

  def rechercherParAuteur(auteur: String): List[Livre] = {
    val livresTrouves = listeLivres.filter(_.auteur == auteur).toList
    println(s"Livres de l'auteur $auteur trouvés: ${livresTrouves.map(_.titre).mkString(", ")}")
    livresTrouves
  }

}
