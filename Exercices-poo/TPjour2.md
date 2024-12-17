## **TP Jeu de Bataille**
### **Contexte** 
Vous devez créer un jeu de bataille où chaque joueur tire une carte d'un deck.

1. **Création de la classe `Carte`** :
   - Créez une **classe `Carte`** avec les attributs :
     - `valeur: String` (As, 2, 3, ..., Roi)
     - `couleur: String` (Trèfle, Cœur, Carreau, Pique)
   
2. **Comparaison des cartes** :
   - Implémentez une méthode `estPlusForteQue(autreCarte: Carte)`.

3. **Création de la classe `Deck`** :
   - Créez une **classe Singleton `Deck`** qui :
     - Contient les **52 cartes du jeu**.
     - Mélange les cartes.
     - Distribue une carte au joueur.

4. **Implémentation du jeu** :
   - Créez une **classe `Joueur`** avec un nom.
   - Chaque joueur tire une carte du `Deck` et la plus forte gagne.