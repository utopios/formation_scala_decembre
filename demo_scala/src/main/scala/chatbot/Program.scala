package chatbot

import akka.actor.typed.ActorSystem
import rx.lang.scala.Observable
import rx.lang.scala.schedulers.NewThreadScheduler


object Program {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem(ChatBot.comportement, "chatbot")

    system ! "Bonjour"
    system ! "Comment ça va ?"
    system ! "Est ce que tu peux m'aider ?"

    val observable = Observable.from(1 to 5)
    val inscription = observable.unsubscribeOn(NewThreadScheduler()).subscribe(element => {
      println(element)
    })

    inscription.unsubscribe()

  }
}
