package correction_tp_jour_2

import correction_tp_jour_2.DeckExtensions.DeckOps

object Program {
  def main(args: Array[String]): Unit = {
    val deck = new Deck()
    deck.melanger()

    val joueur1 = new Joueur("Alice")
    val joueur2 = new Joueur("Bob")

    joueur1.tirerCarte(deck)
    joueur2.tirerCarte(deck)

    (joueur1.carteEnMain, joueur2.carteEnMain) match {
      case (Right(carte1), Right(carte2)) =>
        if (carte1.estPlusForteQue(carte2))
          println(s"${joueur1.nom} gagne avec la carte $carte1 contre $carte2 !")
        else if (carte2.estPlusForteQue(carte1))
          println(s"${joueur2.nom} gagne avec la carte $carte2 contre $carte1 !")
        else
          println(s"Égalité ! $carte1 et $carte2 ont la même valeur.")

      case (Left(erreur1), _) => println(s"Erreur pour ${joueur1.nom} : $erreur1")
      case (_, Left(erreur2)) => println(s"Erreur pour ${joueur2.nom} : $erreur2")
      case _ => println("Impossible de comparer les cartes, l'un des joueurs n'a pas de carte.")
    }
  }
}
