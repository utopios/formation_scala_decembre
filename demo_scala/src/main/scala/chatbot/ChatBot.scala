package chatbot

import akka.actor.typed.scaladsl.Behaviors


object ChatBot {
  val comportement = Behaviors.receiveMessage[String] {
    case "Bonjour" =>
      println("Bonjour à toi aussi")
      Behaviors.same
    case "Comment ça va ?" =>
      println("ça va et toi ?")
      Behaviors.same
    case message =>
      println("Je ne comprends pas la question")
      Behaviors.same
  }
}
