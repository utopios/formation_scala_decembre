

## 📘 **Système de Gestion des Comptes Bancaires**
 

## 🟦 **Contexte** 
Vous allez créer une application de **gestion des comptes bancaires**. Chaque utilisateur peut avoir plusieurs types de comptes, et les opérations de dépôt, retrait et calcul des intérêts doivent être robustes face aux erreurs.  
**But** : Renforcez la gestion des erreurs avec **Option**, **Either** et **exceptions personnalisées**.


---

### 1️⃣ **Création de la classe `CompteBancaire`**
1. **Créez une classe abstraite `CompteBancaire`** avec les attributs suivants :  
   - `numeroCompte: String` (identifiant unique du compte)  
   - `solde: Double` (le solde actuel du compte)  

2. **Ajoutez deux méthodes abstraites** :
   - **`deposer(montant: Double): Either[String, Double]`** : ajoute un montant au solde, mais doit renvoyer **Either** pour signaler les erreurs.  
     - Si le montant est négatif, retournez `Left("Montant négatif non autorisé")`.  
     - Sinon, ajoutez le montant au solde et retournez `Right(solde)`.  

   - **`retirer(montant: Double): Either[String, Double]`** : retire un montant du solde, mais utilise également **Either**.  
     - Si le montant est négatif, retournez `Left("Montant négatif non autorisé")`.  
     - Si le retrait dépasse le solde disponible, retournez `Left("Fonds insuffisants")`.  
     - Sinon, déduisez le montant du solde et retournez `Right(solde)`.  


### 2️⃣ **Héritage des classes**
1. **Créez deux sous-classes** :
   - **`CompteCourant`** :  
     - Autorisez un **découvert maximum de 500€**.  
     - La méthode `retirer(montant: Double)` doit permettre au solde de devenir négatif, mais pas au-delà de -500€.  
     - **Utilisez Either** pour signaler les erreurs comme "Montant négatif" ou "Limite de découvert atteinte".  

   - **`CompteEpargne`** :  
     - Appliquez un **taux d'intérêt annuel de 3%** au solde.  
     - Ajoutez une méthode supplémentaire **`appliquerInteret(): Option[Double]`** pour appliquer les intérêts au solde.  
     - **Utilisez Option** pour renvoyer le nouveau solde ou None si une erreur survient.  


### 3️⃣ **Gestion des erreurs avancées**
1. **Créez des exceptions personnalisées** pour mieux gérer les cas d'erreur :  
   - **MontantNegatifException** : levée si un dépôt ou un retrait a un montant négatif.  
   - **FondsInsuffisantsException** : levée si le retrait dépasse le solde autorisé.  
   - **DecouvertLimiteException** : levée si le CompteCourant dépasse la limite du découvert de -500€.  

2. **Utilisez des `try-catch` pour capturer ces exceptions**.  



### 4️⃣ **Utilisation de la polymorphie**
1. **Créez une liste de comptes (`List[CompteBancaire]`)** et ajoutez-y plusieurs comptes (courants et épargne).  
2. **Parcourez la liste et effectuez des dépôts et retraits**.  
3. **Affichez le solde de chaque compte** à l'aide de la méthode `afficherSolde()`.  

---

## 📘 **Exemple d'Exigences pour les Méthodes**
### **1. Méthode `deposer(montant: Double): Either[String, Double]`**
| Entrée (montant) | Comportement attendu                          | Sortie                          |
|------------------|-----------------------------------------------|----------------------------------|
| `100`            | Ajoute 100 au solde                          | `Right(nouveau solde)`          |
| `-50`            | Montant négatif, retourne une erreur         | `Left("Montant négatif non autorisé")` |

---

### **2. Méthode `retirer(montant: Double): Either[String, Double]` (pour CompteCourant)**
| Solde actuel | Entrée (montant) | Comportement attendu                      | Sortie                          |
|--------------|------------------|------------------------------------------|----------------------------------|
| 1000         | 200               | Retire 200 du solde, OK                  | `Right(nouveau solde)`          |
| 1000         | -50               | Montant négatif, retourne une erreur     | `Left("Montant négatif non autorisé")` |
| 1000         | 1600              | Solde insuffisant, mais autoriser un découvert jusqu'à -500 | `Right(solde après retrait)`    |
| -400         | 200               | Découvert maximum atteint (-500)        | `Left("Limite de découvert atteinte")` |

---

### **3. Méthode `appliquerInteret(): Option[Double]` (pour CompteEpargne)**
| Solde actuel | Comportement attendu                                | Sortie                          |
|--------------|----------------------------------------------------|----------------------------------|
| 2000         | Applique 3% d'intérêt (2000 x 0.03 = 60)            | `Some(2060)`                    |
| 0            | Aucun intérêt ne peut être appliqué                 | `None`                          |

---

## 💻 **Exemple de Simulation**
### 1️⃣ **Création des comptes**
- Créez un **CompteCourant** de 1000€ avec le numéro `CC123`.  
- Créez un **CompteEpargne** de 2000€ avec le numéro `CE456`.  

---

### 2️⃣ **Effectuez les opérations suivantes :**
- Sur le **CompteCourant** :  
  - **Dépôt** de 200€ ➡️ Le solde devient 1200€.  
  - **Retrait** de 1500€ ➡️ Le solde devient -300€ (découvert OK).  
  - **Retrait** de 300€ ➡️ Erreur, car le découvert est limité à -500€.  

- Sur le **CompteEpargne** :  
  - **Dépôt** de 500€ ➡️ Le solde devient 2500€.  
  - **Retrait** de 3000€ ➡️ Erreur, fonds insuffisants.  
  - **Application des intérêts** ➡️ Le solde est augmenté de 3%.  

---

## 🚀 **Challenge Final**
1. **Gérez les erreurs comme un pro** :  
   - Utilisez **Option** pour `appliquerInteret()`.  
   - Utilisez **Either** pour `deposer()` et `retirer()`.  
   - Levez des **exceptions personnalisées** en cas d'erreur critique.  

2. **Ajoutez une méthode** `afficherSolde()` pour afficher les détails de chaque compte.  

3. **Testez votre code** :  
   - Créez plusieurs comptes.  
   - Effectuez des dépôts, des retraits et des erreurs intentionnelles.  
