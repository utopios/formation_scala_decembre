package exercice3

abstract class CompteBancaire(val numeroCompte: String, protected var solde: Double) {

  def deposer(montant: Double): Double = {
    if (montant < 0) throw new MontantNegatifException("Montant négatif non autorisé")
    else {
      solde += montant
      solde
    }
  }

  def retirer(montant: Double): Double

  def afficherSolde(): Unit = {
    println(s"Compte $numeroCompte - Solde : $solde €")
  }
}