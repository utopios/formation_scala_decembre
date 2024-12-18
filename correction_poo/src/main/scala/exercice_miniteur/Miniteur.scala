package exercice_miniteur

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

import scala.concurrent.duration.DurationInt

trait MiniteurMessage
case object Demarrer extends MiniteurMessage
case object Decrementer extends MiniteurMessage

object Miniteur {
  def comportement(secondesRestantes: Int): Behavior[MiniteurMessage] = Behaviors.receive {(context,message) => {
    message match {
      case Demarrer =>
        println("Démarrage du miniteur")
        context.scheduleOnce(1.second,context.self, Decrementer)
        Behaviors.same
      case Decrementer =>
        if(secondesRestantes > 0) {
          println(s"Temps restant : $secondesRestantes secondes")
          context.scheduleOnce(1.second, context.self, Decrementer)
          comportement(secondesRestantes - 1)
        } else {
          Behaviors.stopped
        }

    }
  }}
}
