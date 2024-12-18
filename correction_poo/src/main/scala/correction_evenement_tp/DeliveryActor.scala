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
              timers.startSingleTimer("EnTransit", StatutColis(colisId, "En transit"), 2.second)
              cycleDeVie("Prise en charge")
            case StatutColis(colisId, "En transit") =>
              println(s"[$colisId] Le colis est maintenant en transit.")
              timers.startSingleTimer("AuCentreDeTri", StatutColis(colisId, "Au centre de tri"), 4.second)
              cycleDeVie("En transit")
            case StatutColis(colisId, "Au centre de tri") =>
              println(s"[$colisId] Le colis est arrivé au centre de tri.")
              timers.startSingleTimer("EnCoursDeLivraison", StatutColis(colisId, "En cours de livraison"), 3.seconds)
              cycleDeVie("Au centre de tri")
            case StatutColis(colisId, "En cours de livraison") =>
              println(s"[$colisId] Le colis est en route vers le client.")
              timers.startSingleTimer("EnCoursDeLivraison", StatutColis(colisId, "Livré"), 3.seconds)
              cycleDeVie("En cours de livraison")
            case StatutColis(colisId, "Livré") =>
              println(s"[$colisId] Le colis a été livré.")
              Behaviors.stopped
            case _ =>
              println(s"[$colisId] Message inattendu reçu.")
              Behaviors.same
          }
      }
      cycleDeVie("Initial")
    }
  }
}
