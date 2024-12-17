
object Joueur {
  private var compteurGlobal:Int = 0

  def nombreTotalDeJoueurs: Int = compteurGlobal

  private def incrementerCompteur() = {
    compteurGlobal += 1
  }
}

class Joueur(var nom:String = "Joueur Inconnu", var niveau:Int = 1, var experience:Int = 0) {

  Joueur.incrementerCompteur()
  def this(nom:String) = {
    this(nom, 1, 0)
  }
  def this(nom:String, niveau:Int) = {
    this(nom,niveau, 0)
  }
  def validerLaQuete(xp:Int) = {
    println(s"$nom valide une quête et gagne $xp points d'expérience")
    experience += xp
    monterDeNiveau()
  }
  def monterDeNiveau() = {
    if(experience >= 100) {
      niveau += 1
      experience = 0
      println(s"$nom monte de niveau ! Nouveau niveau $niveau")
    }
  }

  override def toString:String = s"Nom =$nom, Niveau = $niveau, Expérience = $experience"
}
