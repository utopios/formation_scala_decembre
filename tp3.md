# **🎯 TP Base de Scala (Avec Fonctions, Collections et Pattern Matching)**

---

## **Contexte du TP : Système de Gestion des Inscriptions à une Formation**

Dans ce TP, vous allez développer un **système de gestion des inscriptions** pour un centre de formation. Ce système permettra :
1. **D'afficher la liste des formations disponibles**.
2. **De permettre aux candidats de s'inscrire à une formation**.
3. **De gérer les candidatures** (vérifier si la formation a encore des places disponibles).
4. **De calculer les frais d'inscription**.
5. **De générer un récapitulatif des inscriptions**.

---

## **🛠️ Objectifs du TP**
- **Utiliser des fonctions** pour organiser le code.
- **Utiliser les collections** (`Map`, `List`) pour gérer les formations et les inscriptions.
- **Utiliser le pattern matching** pour vérifier les types de formation et appliquer des frais spécifiques.
- **Utiliser des boucles et des saisies utilisateur** (`readLine`) pour permettre l'interaction.

---

## **📋 Plan du TP**

1. **Affichage du Catalogue des Formations**.
2. **Inscription des Candidats à une Formation**.
3. **Vérification des Places Disponibles**.
4. **Calcul des Frais d'Inscription**.
5. **Génération de la Facture d'Inscription**.

---

## **🎉 Exemple de Déroulement du TP**

```
📜 Catalogue des Formations :
[F1] Formation Java (10 places disponibles) - 500€
[F2] Formation Python (8 places disponibles) - 450€
[F3] Formation Data Science (5 places disponibles) - 800€

Entrez le code de la formation à laquelle vous souhaitez vous inscrire (ou "FIN" pour quitter) :
F1
Entrez votre nom complet :
Jean Dupont
Entrez votre adresse e-mail :
jean.dupont@gmail.com

✅ Inscription réussie à la formation Java.

Entrez le code de la formation à laquelle vous souhaitez vous inscrire (ou "FIN" pour quitter) :
F3
Entrez votre nom complet :
Marie Dubois
Entrez votre adresse e-mail :
marie.dubois@gmail.com

✅ Inscription réussie à la formation Data Science.

Entrez le code de la formation à laquelle vous souhaitez vous inscrire (ou "FIN" pour quitter) :
FIN

📋 **Résumé des Inscriptions**
- Jean Dupont a rejoint la Formation Java.
- Marie Dubois a rejoint la Formation Data Science.

📄 **Facture d'Inscription**
- Formation Java : 500€
- Formation Data Science : 800€

💸 **Total à payer** : 1300€
```

