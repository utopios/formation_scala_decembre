class Person {

  var name:String = _
  var age:Int = _

  def afficher() = {
    println(s"Name ${this.name}, Age ${age}")
  }

  def this(name:String, age:Int) = {
    this()
    this.name = name
    this.age = age
  }
}
