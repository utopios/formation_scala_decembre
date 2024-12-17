package exercice2

import scala.collection.mutable.ListBuffer

class Utilisateur(val nom: String, val prenom: String) {
  var listeEmprunts: ListBuffer[Livre] = ListBuffer()

  def emprunter(livre: Livre): Unit = {
    if (livre.disponible) {
      livre.disponible = false
      listeEmprunts += livre
      println(s"$prenom $nom a emprunté le livre: ${livre.titre}")
    } else {
      println(s"Le livre ${livre.titre} n'est pas disponible.")
    }
  }

  def rendre(livre: Livre): Unit = {
    if (listeEmprunts.contains(livre)) {
      livre.disponible = true
      listeEmprunts -= livre
      println(s"$prenom $nom a rendu le livre: ${livre.titre}")
    } else {
      println(s"$prenom $nom n'a pas emprunté le livre: ${livre.titre}")
    }
  }


}
