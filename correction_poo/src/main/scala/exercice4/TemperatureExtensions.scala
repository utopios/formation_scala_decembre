package exercice4

object TemperatureExtensions {
  implicit class RichInt(val celsius: Int) extends AnyVal {
    def toFahrenheit(): Double = (celsius * 9.0 / 5.0) + 32
  }

  implicit class RichDouble(val fahrenheit: Double) extends AnyVal {
    def toCelsius(): Double = (fahrenheit - 32) * 5.0 / 9.0
  }
}
