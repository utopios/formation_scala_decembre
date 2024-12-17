## **1. Système de Gestion d'une Bibliothèque**


### **Contexte** 
Nous allons modéliser une bibliothèque qui gère des livres, des auteurs et des utilisateurs. Les utilisateurs peuvent emprunter et rendre des livres.

1. **Création de classes de base** :
   - Créez une **classe `Livre`** avec les attributs suivants :
     - `titre: String`
     - `auteur: String`
     - `isbn: String`
     - `disponible: Boolean`
   
2. **Manipulation des objets** :
   - Créez 3 livres et affichez leurs titres et disponibilités.
   
3. **Créer une méthode d'affichage** :
   - Ajoutez une méthode `afficherInfo()` dans la classe `Livre` qui affiche les informations du livre.


4. **Gestion des emprunts** :
   - Créez une **classe `Utilisateur`** avec les attributs :
     - `nom: String`
     - `prenom: String`
     - `listeEmprunts: List[Livre]`
   - Implémentez la méthode `emprunter(livre: Livre)` qui permet à l'utilisateur d'emprunter un livre.
   - Implémentez la méthode `rendre(livre: Livre)` qui permet à l'utilisateur de rendre un livre.

5. **Gestion de la bibliothèque** :
   - Créez une **classe `Bibliotheque`** qui contient une **liste de livres**.
   - Implémentez les méthodes suivantes :
     - `ajouterLivre(livre: Livre)`: ajoute un livre à la bibliothèque.
     - `rechercherParAuteur(auteur: String)`: retourne la liste des livres d'un auteur.
     - `listerLivresDisponibles()`: retourne les livres disponibles.