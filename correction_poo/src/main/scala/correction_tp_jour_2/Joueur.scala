package correction_tp_jour_2

class Joueur(val nom: String) {
  var carteEnMain: Either[String, Carte] = Left("Aucune carte en main.")

  def tirerCarte(deck: Deck): Unit = {
    carteEnMain = deck.distribuer()
    carteEnMain match {
      case Right(carte) => println(s"$nom a tiré la carte: $carte")
      case Left(erreur) => println(s"$nom n'a pas pu tirer de carte: $erreur")
    }
  }
}
