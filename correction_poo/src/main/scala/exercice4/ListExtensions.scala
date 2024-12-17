package exercice4

object ListExtensions {
  implicit class RichList(val values: List[Double]) extends AnyVal {
    def moyenne(): Double = if (values.nonEmpty) values.sum / values.length else 0.0

    def mediane(): Double = {
      val sortedValues = values.sorted
      val len = sortedValues.length
      if (len % 2 == 0) (sortedValues(len / 2 - 1) + sortedValues(len / 2)) / 2.0
      else sortedValues(len / 2)
    }

    def variance(): Double = {
      val mean = moyenne()
      values.map(x => math.pow(x - mean, 2)).moyenne()
    }
  }
}
