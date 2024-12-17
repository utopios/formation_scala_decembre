object Extension {
  implicit class RichInt(x:Int) {
    def doubler : Int = x * 2
  }
}
