# **🛠️ TP Syntaxe de Base de Scala (Avec Fonctions, Collections et Pattern Matching)**

---

## **🎯 Contexte du TP : Système de Gestion des Commandes d'un Restaurant**

Vous travaillez sur le **système de gestion des commandes d'un restaurant**. Ce système permet de **prendre les commandes des clients**, de **calculer le montant total de la commande**, et de **gérer les réductions et promotions**.

L'objectif est de développer une application en Scala qui permet de :
1. **Afficher le menu du restaurant**.
2. **Prendre les commandes des clients**.
3. **Calculer le total de la commande**.
4. **Appliquer des réductions** selon certaines conditions.
5. **Afficher la facture finale**.

---

## **📋 Plan du TP**

### **1️⃣ Affichage du Menu**
- Le menu du restaurant est une **collection d'articles** (plat, prix, catégorie).
- Chaque plat est identifié par un **code** (par exemple "P1" pour "Pizza", "D1" pour "Dessert", etc.).
- Le client peut voir la liste des plats disponibles.

---

### **2️⃣ Prise de Commande**
- Le client peut commander **plusieurs plats**.
- Pour chaque plat, le client saisit le **code du plat** (par exemple, "P1" pour Pizza).
- La commande se termine lorsque le client saisit **"FIN"**.

---

### **3️⃣ Calcul du Montant Total**
- Le total est calculé en **additionnant les prix de chaque plat** commandé.
- Des **réductions** sont appliquées automatiquement :
  - **10% de réduction si le total dépasse 50€**.
  - **5% de réduction si plus de 3 plats sont commandés**.

---

### **4️⃣ Affichage de la Facture**
- Affichez :
  - **La liste des plats commandés**.
  - **Le total avant réduction**.
  - **Les réductions appliquées**.
  - **Le total final**.

---

## **🛠️ Objectifs Pédagogiques**
- **Utiliser des fonctions** pour organiser le code.
- **Manipuler des collections** (`List`, `Map`) pour gérer le menu et la commande.
- **Utiliser le pattern matching** (`match case`) pour appliquer des réductions.
- **Utiliser des boucles** pour la prise de commande.
- **Travailler avec la saisie utilisateur** (`readLine`).

---

## **🎉 Exemple de déroulement du TP**

```
📜 Menu du Restaurant :
[P1] Pizza Margherita - 12€
[P2] Burger Classique - 10€
[P3] Salade César - 8€
[D1] Tiramisu - 6€
[D2] Glace Vanille - 4€

Entrez le code du plat que vous souhaitez commander (ou "FIN" pour terminer) : P1
Entrez le code du plat que vous souhaitez commander (ou "FIN" pour terminer) : P2
Entrez le code du plat que vous souhaitez commander (ou "FIN" pour terminer) : D1
Entrez le code du plat que vous souhaitez commander (ou "FIN" pour terminer) : FIN

🍽️ **Votre commande** :
- Pizza Margherita : 12€
- Burger Classique : 10€
- Tiramisu : 6€

Total avant réduction : 28€
Réduction pour 3 plats commandés (5%) : -1.4€

💸 **Total à payer** : 26.6€
```

---

## **📝 Instructions**

---

### **1️⃣ Affichage du Menu**

**🎯 Objectif**
- Afficher le menu des plats disponibles du restaurant.

**📋 Consignes**
1. Le menu est une **collection de plats**. Chaque plat a :
   - Un **code** (par ex. "P1", "P2", etc.).
   - Un **nom** (par ex. "Pizza Margherita", "Burger Classique").
   - Un **prix** (par ex. 12€, 10€).

2. Affichez le menu de manière lisible.

**💡 Exemple de sortie**
```
📜 Menu du Restaurant :
[P1] Pizza Margherita - 12€
[P2] Burger Classique - 10€
[P3] Salade César - 8€
[D1] Tiramisu - 6€
[D2] Glace Vanille - 4€
```

---

### **2️⃣ Prise de Commande**

**🎯 Objectif**
- Permettre au client de **commander plusieurs plats**.
- Chaque commande doit être identifiée par le **code du plat**.
- Le client saisit les **codes des plats** un par un.
- La saisie se termine lorsque le client saisit **"FIN"**.

**📋 Consignes**
1. Demandez au client de saisir le **code du plat**.
2. Si le client entre **"FIN"**, la saisie s'arrête.
3. Enregistrez les plats choisis.

**💡 Exemple de sortie**
```
Entrez le code du plat que vous souhaitez commander (ou "FIN" pour terminer) : P1
Entrez le code du plat que vous souhaitez commander (ou "FIN" pour terminer) : D1
Entrez le code du plat que vous souhaitez commander (ou "FIN" pour terminer) : FIN
```

---

### **3️⃣ Calcul du Montant Total**

**🎯 Objectif**
- **Calculez le total avant réduction**.
- **Appliquez des réductions** si :
  - Le total dépasse **50€** => réduction de **10%**.
  - Plus de **3 plats** commandés => réduction de **5%**.

**📋 Consignes**
1. Calculez le **total des plats** commandés.
2. **Appliquez les réductions** si les conditions sont remplies.
3. Affichez :
   - **Le total avant réduction**.
   - **Les réductions appliquées**.
   - **Le total final**.

**💡 Exemple de sortie**
```
Total avant réduction : 60€
Réduction de 10% appliquée : -6€
Total final : 54€
```

---

### **4️⃣ Affichage de la Facture**

**🎯 Objectif**
- Affichez la **facture complète** du client.

**📋 Consignes**
1. Affichez la liste des plats commandés.
2. Affichez le **total avant réduction**.
3. Affichez les **réductions appliquées**.
4. Affichez le **total final** à payer.

**💡 Exemple de sortie**
```
🍽️ **Votre commande** :
- Pizza Margherita : 12€
- Burger Classique : 10€
- Tiramisu : 6€

Total avant réduction : 28€
Réduction pour 3 plats commandés (5%) : -1.4€

💸 **Total à payer** : 26.6€
```



