package correction_evenement_tp

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

object MainActor {
  def apply(): Behavior[Command] = Behaviors.setup { context =>
    Behaviors.receiveMessage {
      case PasserCommande(clientId, adresse, produit) =>
        val colisId = java.util.UUID.randomUUID().toString
        println(s"Création de la commande $colisId pour le client $clientId, produit: $produit")
        val deliveryActor = context.spawn(DeliveryActor(colisId), s"delivery-$colisId")
        deliveryActor ! LancerLivraison(colisId, produit, adresse)
        Behaviors.same
      case SuivreColis(clientId, colisId) =>
        println(s"Suivi demandé par le client $clientId pour le colis $colisId")
        Behaviors.same
      case StatutColis(colisId, etat) =>
        println(s"Colis $colisId, nouvel état: $etat")
        Behaviors.same
      case CommandeEchouee(colisId, raison) =>
        println(s"Commande $colisId échouée, raison: $raison")
        Behaviors.same
    }
  }
}
