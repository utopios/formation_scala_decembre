## 📘 **Sujet d'Exercice : Les Extensions en Scala**


## 🟦 **Contexte du Sujet**

Vous travaillez sur un **système de gestion des données météorologiques** pour une application de suivi des prévisions météo. L'objectif est de manipuler des données de **températures**, de **vitesse du vent** et d'autres **paramètres climatiques**.

Cependant, vous ne voulez pas **modifier les classes existantes** (comme `Int`, `Double`, `String`, etc.). Vous allez donc **ajouter des méthodes à ces classes existantes** sans les modifier, en utilisant **les extensions (Extension Methods) de Scala 3**.


---

## 🟦 **Exercices et Questions**

### 🔷 **1️⃣ Ajout de méthodes d'extension sur `Int` et `Double`**

**Objectif** : Ajouter de nouvelles méthodes pour les classes `Int` et `Double` afin de manipuler les **températures**.  

1. **Créer une extension** pour la classe `Int` et `Double` pour convertir des **degrés Celsius en Fahrenheit** et **vice versa**.  
   - Méthode 1 : `toFahrenheit() : Double` (conversion Celsius → Fahrenheit)  
   - Méthode 2 : `toCelsius() : Double` (conversion Fahrenheit → Celsius)  

**Formules de conversion** :  
- Celsius → Fahrenheit : `(celsius * 9 / 5) + 32`  
- Fahrenheit → Celsius : `(fahrenheit - 32) * 5 / 9`  

📘 **Exemple attendu** :
```scala
println(25.toFahrenheit()) // 77.0
println(77.0.toCelsius()) // 25.0
```

---

### 🔷 **2️⃣ Ajout de méthodes d'extension sur `String`**

**Objectif** : Enrichir la classe `String` pour **normaliser les noms des villes**.  

1. **Créer une extension** pour la classe `String` avec une méthode :  
   - **`capitalizeWords(): String`** : met la première lettre de chaque mot en majuscule et le reste en minuscule.  

📘 **Exemple attendu** :
```scala
val ville = "paris".capitalizeWords() // "Paris"
val ville2 = "new york".capitalizeWords() // "New York"
```

---

### 🔷 **3️⃣ Extension pour calculer des statistiques sur une liste de données**

**Objectif** : Ajouter des méthodes d'extension à **List[Double]** pour calculer des statistiques météo.  

1. **Créer une extension** pour la classe **List[Double]** avec les méthodes suivantes :  
   - **`moyenne(): Double`** : retourne la moyenne des valeurs.  
   - **`mediane(): Double`** : retourne la médiane des valeurs.  
   - **`variance(): Double`** : retourne la variance des valeurs.  

📘 **Exemple attendu** :
```scala
val temperatures = List(10.0, 20.0, 30.0, 40.0, 50.0)
println(temperatures.moyenne()) // 30.0
println(temperatures.mediane()) // 30.0
println(temperatures.variance()) // 200.0
```

---

### 🔷 **4️⃣ Ajout d'une "type class" pour le suivi des unités météorologiques**

**Objectif** : Créer une **Type Class** `Affichable` qui définit comment afficher des données de manière lisible (pour des températures, des vitesses de vent, etc.).  

1. **Créer une trait `Affichable[T]`** avec une méthode :  
   - **`afficher(t: T): String`**  

2. **Implémenter l'extension de la type class** pour les types suivants :  
   - Pour **Double** : Formate la valeur avec 2 décimales (`f"$t%.2f"`) et ajoute l'unité `"°C"` si c'est une température.  
   - Pour **Int** : Affiche l'entier avec l'unité `"km/h"` (vitesse du vent).  
   - Pour **String** : Affiche simplement la chaîne de caractères.  

3. **Ajouter une méthode `afficher()`** qui permet d'appeler automatiquement la méthode `afficher()` de la type class.  

📘 **Exemple attendu** :
```scala
import Affichable.syntax._

val temperature: Double = 25.5
val vent: Int = 60
val ville: String = "paris"

println(temperature.afficher()) // "25.50°C"
println(vent.afficher()) // "60 km/h"
println(ville.afficher()) // "paris"
```

---

### 🔷 **5️⃣ Utilisation des extensions et vérification des résultats**

1. **Créez un programme principal** qui :  
   - Utilise toutes les méthodes d'extension créées (pour `Int`, `Double`, `List`, `String`).  
   - Affiche des résultats de conversions de températures, des statistiques sur des listes de températures et la mise en forme de chaînes de caractères.  
