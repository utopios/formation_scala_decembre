package correction_evenement_tp

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

import scala.concurrent.duration.DurationInt

object DeliveryActor {
  def apply(colisId:String):Behavior[Command] = Behaviors.setup {
    context => {
      def cycleDeVie(etat:String): Behavior[Command] = Behaviors.withTimers {
        timers =>
          Behaviors.receiveMessage {
            case LancerLivraison(colisId, produit, adresse) =>
              println(s"[$colisId] Prise en charge du produit $produit pour l'adresse $adresse")
              timers.startSingleTimer("En transit", StatutColis(colisId, "En transit"), 2.second)
              cycleDeVie("Prise en charge")
            case StatutColis(colisId, "En transit") =>
              println(s"[$colisId] Le colis est maintenant en transit.")
              timers.startSingleTimer("En transit", StatutColis(colisId, "Au centre de tri"), 2.second)
              cycleDeVie("En transit")
          }
          cycleDeVie("Initial")
      }


    }
  }
}
