object Main {
  def main(args: Array[String]): Unit = {
    val joueur1 = new Joueur()
    println(s"Joueur créé : $joueur1")

    val joueur2 = new Joueur("Ihab")
    println(s"joueur crée : $joueur2")

    val joueur3 = new Joueur("Toto", 1, 50)
    println(s"joueur crée : $joueur3")

    joueur2.validerLaQuete(60)
    joueur2.validerLaQuete(70)

    println(s"Nombre total des joueurs  : ${Joueur.nombreTotalDeJoueurs}")
  }

}
