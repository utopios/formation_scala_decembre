package correction_evenement_tp

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

object TrackingActor {
  def apply(): Behavior[Command] = Behaviors.receive { (context, message) =>
    message match {
      case EnvoyerSuivi(clientId, etat) =>
        println(s"Envoi de l'état au client $clientId: $etat")
        Behaviors.same
      case _ =>
        println(s"Message inconnu pour TrackingActor")
        Behaviors.same
    }
  }
}
