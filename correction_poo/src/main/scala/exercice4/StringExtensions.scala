package exercice4

object StringExtensions {
  implicit class RichString(val str: String) extends AnyVal {
    def capitalizeWords(): String = str.split(" ").map(_.capitalize).mkString(" ")
  }
}
