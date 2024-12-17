package exercice2

object Main {
  def main(args: Array[String]): Unit = {
    val livre1 = new Livre("Les Misérables", "Victor Hugo", "12345")
    val livre2 = new Livre("1984", "George Orwell", "67890")
    val livre3 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "54321")

    livre1.afficherInfo()
    livre2.afficherInfo()
    livre3.afficherInfo()

    val bibliotheque = new Bibliotheque()
    bibliotheque.ajouterLivre(livre1)
    bibliotheque.ajouterLivre(livre2)
    bibliotheque.ajouterLivre(livre3)

    val utilisateur1 = new Utilisateur("Dupont", "Jean")
    utilisateur1.emprunter(livre1)
    utilisateur1.emprunter(livre2)

    bibliotheque.listerLivresDisponibles()

    utilisateur1.rendre(livre1)
    bibliotheque.listerLivresDisponibles()
  }
}
