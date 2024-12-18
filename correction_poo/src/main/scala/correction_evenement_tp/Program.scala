package correction_evenement_tp

import akka.actor.typed.ActorSystem

object Program {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem(MainActor(), "systeme-livraison")
    system ! PasserCommande("client1", "123 rue Scala", "Produit A")
    system ! PasserCommande("client2", "45 rue Akka", "Produit B")
    system ! PasserCommande("client3", "12 avenue Functional", "Produit C")
  }
}
