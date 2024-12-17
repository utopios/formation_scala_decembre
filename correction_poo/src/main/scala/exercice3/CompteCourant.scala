package exercice3

class CompteCourant(numeroCompte: String, solde: Double) extends CompteBancaire(numeroCompte, solde) {
  val decouvertAutorise: Double = -500

  override def retirer(montant: Double): Double = {
    if (montant < 0) throw new MontantNegatifException("Montant négatif non autorisé")
    else if (solde - montant < decouvertAutorise) throw new DecouvertLimiteException("Limite de découvert atteinte")
    else {
      solde -= montant
      solde
    }
  }

  override def afficherSolde(): Unit = {
    super.afficherSolde()
    println(s"(Découvert autorisé jusqu'à : $decouvertAutorise €)")
  }

  /*
  * override def retirer(montant: Double): Either[String, Double] = {
      if (montant < 0) Left("Montant négatif non autorisé")
      else if (solde - montant < decouvertAutorise) Left("Limite de découvert atteinte")
      else {
        solde -= montant
        Right(solde)
      }
    }
  * */
}