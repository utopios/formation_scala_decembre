import scala.collection.mutable.ListBuffer

class Voiture(var prix:Double, var model:String) {

  var observers:ListBuffer[(Double) => Unit] = ListBuffer.empty[(Double)=>Unit]

  def promotion(reduction:Double) = {
    prix -= reduction
    notification()
  }

  def notification() = {
    observers.foreach(_(prix))
  }
}
