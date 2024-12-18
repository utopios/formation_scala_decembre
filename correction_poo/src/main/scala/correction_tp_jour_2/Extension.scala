package correction_tp_jour_2

import scala.util.Random

object ListExtensions {
  implicit class ListOps[A](list: List[A]) {
    def shuffle(): List[A] = Random.shuffle(list)
  }
}

object DeckExtensions {
  import ListExtensions._

  implicit class DeckOps(deck: Deck) {
    def reinitialiser(): Unit = {
      deck.melanger()
      println("Le deck a été réinitialisé.")
    }

    def melanger(): Unit = {
      deck.cartes = deck.cartes.shuffle()
      println("Le deck a été mélangé.")
    }
  }
}