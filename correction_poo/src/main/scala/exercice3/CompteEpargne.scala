package exercice3

class CompteEpargne(numeroCompte: String, solde: Double) extends CompteBancaire(numeroCompte, solde) {
  val tauxInteret: Double = 0.03

  override def retirer(montant: Double): Double = {
    if (montant < 0) throw new MontantNegatifException("Montant négatif non autorisé")
    else if (solde - montant < 0) throw new FondsInsuffisantsException("Fonds insuffisants")
    else {
      solde -= montant
      solde
    }
  }

  def appliquerInteret(): Option[Double] = {
    if (solde > 0) {
      solde += solde * tauxInteret
      Some(solde)
    } else {
      None
    }
  }

  /**
   * override def retirer(montant: Double): Either[String, Double] = {
   * if (montant < 0) Left("Montant négatif non autorisé")
   * else if (solde - montant < 0) Left("Fonds insuffisants")
   * else {
   * solde -= montant
   * Right(solde)
   * }
   * }
   * */
}
