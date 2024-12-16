# **TP  Base de Scala**

---

## **🎯 Contexte du TP : Application de Gestion d'une Caisse de Supermarché**

Vous travaillez sur une **caisse enregistreuse de supermarché**. L'objectif de ce TP est de développer un programme complet pour :
1. **Saisir les prix de plusieurs produits**.
2. **Calculer le total des achats**.
3. **Appliquer des réductions** en fonction de certaines règles.
4. **Afficher la facture finale**.



---

## **🛠️ Objectifs pédagogiques**
- Manipuler des **variables et des constantes**.
- Utiliser des **opérateurs** pour faire des calculs.
- Gérer des **boucles de saisie utilisateur**.
- Maîtriser l'utilisation des **conditions (if, else, if-else)**.


---

## **📋 Plan du TP**

1. **Saisie des produits** : Le caissier saisit le prix de chaque produit.
2. **Calcul des totaux** : Calcul du total des produits et du nombre total de produits.
3. **Application des réductions** :
   - Si le total dépasse **100 €**, appliquez une réduction de **10%**.
   - Si le nombre de produits achetés dépasse **5**, appliquez une réduction de **5%**.
   - Ces réductions sont **cumulables**.
4. **Affichage de la facture** :
   - Affichez le **nombre total de produits**.
   - Affichez le **total avant réduction**.
   - Affichez le **montant total de la réduction**.
   - Affichez le **total final**.

---

## **🎉 Exemple de déroulement**

```
Entrez le prix du produit (ou 0 pour terminer) : 20
Entrez le prix du produit (ou 0 pour terminer) : 30
Entrez le prix du produit (ou 0 pour terminer) : 25
Entrez le prix du produit (ou 0 pour terminer) : 40
Entrez le prix du produit (ou 0 pour terminer) : 0

=== FACTURE ===
Nombre de produits : 4
Total avant réduction : 115 €
Réduction de 10% appliquée : -11.5 €
Total final : 103.5 €
```


