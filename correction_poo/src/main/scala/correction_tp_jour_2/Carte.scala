package correction_tp_jour_2

class Carte(val valeur: String, val couleur: String) {

  private val ordreValeur = Map(
    "2" -> 2, "3" -> 3, "4" -> 4, "5" -> 5, "6" -> 6, "7" -> 7, "8" -> 8, "9" -> 9,
    "10" -> 10, "Valet" -> 11, "Dame" -> 12, "Roi" -> 13, "As" -> 14
  )

  def estPlusForteQue(autreCarte: Carte): Boolean = {
    ordreValeur(this.valeur) > ordreValeur(autreCarte.valeur)
  }

  override def toString: String = s"$valeur de $couleur"
}
