package exercice2

class Livre(val titre: String, val auteur: String, val isbn: String, var disponible: Boolean = true) {

  // Méthode pour afficher les informations du livre
  def afficherInfo(): Unit = {
    println(s"Titre: $titre, Auteur: $auteur, ISBN: $isbn, Disponible: ${if (disponible) "Oui" else "Non"}")
  }
}
