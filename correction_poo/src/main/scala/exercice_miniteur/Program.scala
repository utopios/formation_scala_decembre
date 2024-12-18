package exercice_miniteur

import akka.actor.typed.ActorSystem


object Program {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem(Miniteur.comportement(10), "system-minuteur")
    system ! Demarrer
  }
}
