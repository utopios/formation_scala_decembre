package correction_tp_jour_2

class Deck {
  private val valeurs = List("2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As")
  private val couleurs = List("Trèfle", "Cœur", "Carreau", "Pique")

  var cartes: List[Carte] = for {
    valeur <- valeurs
    couleur <- couleurs
  } yield new Carte(valeur, couleur)

  def distribuer(): Either[String, Carte] = {
    if (cartes.nonEmpty) {
      val carte = cartes.head
      cartes = cartes.tail
      Right(carte)
    } else Left("Le deck est vide, impossible de distribuer une carte.")
  }

  def afficherDeck(): Unit = {
    println("Cartes restantes dans le deck:")
    cartes.foreach(println)
  }
}
