## 📝 **Sujet d'exercice : Classe Joueur**

### 🔹 **Objectif :**
Créer une classe **Joueur** en Scala qui respecte les spécifications suivantes.

---

### 🔹 **Spécifications générales :**
1. **Attributs de la classe `Joueur` :**
   - **nom** : Nom du joueur (String).
   - **niveau** : Niveau du joueur (Int).
   - **experience** : Expérience du joueur (Int).

2. **Compteur global de joueurs :**
   - Ce compteur est **partagé entre toutes les instances**. Il compte le nombre total de joueurs créés.
   - Ce compteur sera implémenté dans un **objet compagnon** de la classe `Joueur`.

3. **Constructeurs (3 au total) :**
   - **Constructeur vide** : Crée un joueur avec :
     - **nom** = `"Joueur inconnu"`.
     - **niveau** = `1`.
     - **experience** = `0`.
   - **Constructeur avec nom uniquement** :
     - Initialise le joueur avec un nom donné.
     - **niveau** = `1` et **experience** = `0`.
   - **Constructeur complet** :
     - Permet de définir directement le nom, le niveau et l'expérience.

4. **Méthodes :**
   - **validerLaQuete(xp: Int)** : Ajoute de l'expérience au joueur en fonction de la quantité passée en paramètre.
   - **monterDeNiveau()** :
     - Vérifie si le joueur a atteint ou dépassé **100 points d'expérience**.
     - Si oui :
       - Le joueur gagne **1 niveau**.
       - L'expérience est réinitialisée à **0**.
     - Sinon :
       - Rien ne se passe.


### 🔹 **Exemple de sortie attendue :**

```plaintext
Système de gestion des joueurs initialisé
Nombre total de joueurs : 0

Joueur créé : Nom = Joueur inconnu, Niveau = 1, Expérience = 0
Joueur créé : Nom = Alice, Niveau = 1, Expérience = 0
Joueur créé : Nom = Bob, Niveau = 3, Expérience = 50

Alice valide une quête et gagne 60 points d'expérience.
Alice monte de niveau ! Nouveau niveau : 2, Expérience : 0

Nombre total de joueurs : 3
```
