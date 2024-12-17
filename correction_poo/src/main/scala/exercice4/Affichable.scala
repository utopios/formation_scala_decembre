package exercice4

trait Affichable[T] {
  def afficher(t:T):String
}
object Affichable {

  def apply[T](implicit instance: Affichable[T]):Affichable[T]= instance
  object syntax {
    implicit class AffichableOps[T](t:T)(implicit affichable: Affichable[T]) {
      def afficher():String = affichable.afficher(t)
    }
  }

  implicit val affichableDouble: Affichable[Double] = new Affichable[Double] {
    def afficher(t: Double): String = f"$t%.2f°C"
  }

  implicit val affichableInt: Affichable[Int] = new Affichable[Int] {
    def afficher(t: Int): String = s"$t km/h"
  }

  implicit val affichableString: Affichable[String] = new Affichable[String] {
    def afficher(t: String): String = t
  }
}
