package exercice4

import exercice4.Affichable.syntax.AffichableOps
import exercice4.ListExtensions.RichList
import exercice4.StringExtensions.RichString
import exercice4.TemperatureExtensions.{RichDouble, RichInt}

object Program {
  def main(args: Array[String]): Unit = {

    println(25.toFahrenheit())

    println(77.0.toCelsius())

    val ville1 = "paris"
    val ville2 = "new york"

    println(ville1.capitalizeWords())
    println(ville2.capitalizeWords())

    val temperatures = List(10.0, 20.0, 30.0, 40.0, 50.0)
    println(temperatures.moyenne())

    val temperature: Double = 25.5
    println(temperature.afficher())
  }
}
