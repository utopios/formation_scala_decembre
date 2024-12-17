package exercice3

object Main {
  def main(args: Array[String]): Unit = {
    val compte1 = new CompteCourant("CC123", 1000.00)
    val compte2 = new CompteEpargne("CE456", 2000.00)

    val comptes: List[CompteBancaire] = List(compte1, compte2)

    println("=== Opérations sur le Compte Courant ===")
    try {
      val nouveauSolde = compte1.deposer(200.00)
      println(s"Nouveau solde : $nouveauSolde €")
    } catch {
      case e: MontantNegatifException => println(s"Erreur : ${e.getMessage}")
    }

    try {
      val nouveauSolde = compte1.retirer(1500.00)
      println(s"Nouveau solde : $nouveauSolde €")
    } catch {
      case e: MontantNegatifException => println(s"Erreur : ${e.getMessage}")
      case e: DecouvertLimiteException => println(s"Erreur : ${e.getMessage}")
    }

    try {
      val nouveauSolde = compte1.retirer(300)
      println(s"Nouveau solde : $nouveauSolde €")
    } catch {
      case e: MontantNegatifException => println(s"Erreur : ${e.getMessage}")
      case e: DecouvertLimiteException => println(s"Erreur : ${e.getMessage}")
    }

    println("\n=== Opérations sur le Compte Epargne ===")
    try {
      val nouveauSolde = compte2.deposer(500)
      println(s"Nouveau solde : $nouveauSolde €")
    } catch {
      case e: MontantNegatifException => println(s"Erreur : ${e.getMessage}")
    }

    try {
      val nouveauSolde = compte2.retirer(3000)
      println(s"Nouveau solde : $nouveauSolde €")
    } catch {
      case e: MontantNegatifException => println(s"Erreur : ${e.getMessage}")
      case e: FondsInsuffisantsException => println(s"Erreur : ${e.getMessage}")
    }

    compte2.appliquerInteret() match {
      case Some(solde) => println(s"Nouveau solde avec intérêts : $solde €")
      case None => println("Aucun intérêt appliqué.")
    }

    /*
    compte1.deposer(200) match {
        case Right(solde) => println(s"Nouveau solde : $solde €")
        case Left(erreur) => println(s"Erreur : $erreur")
      }

      compte1.retirer(1500) match {
        case Right(solde) => println(s"Nouveau solde : $solde €")
        case Left(erreur) => println(s"Erreur : $erreur")
      }

      compte1.retirer(300) match {
        case Right(solde) => println(s"Nouveau solde : $solde €")
        case Left(erreur) => println(s"Erreur : $erreur")
      }

     */

    // Affichage des soldes de tous les comptes
    println("\n=== Soldes de tous les comptes ===")
    comptes.foreach(_.afficherSolde())
  }
}
