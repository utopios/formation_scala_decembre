### 📘 **Sujet d'Exercice : Gestion d'un Système de Livraison de Colis**

---

### 🎯 **Contexte**  
Vous devez développer un **système de livraison de colis**. Ce système permet de **gérer les expéditions de colis** et de suivre leur **cycle de vie** (de la prise en charge jusqu'à la livraison). 

Chaque colis suit un cycle de vie composé des étapes suivantes :  
1. **Prise en charge** (le colis est enregistré).  
2. **En transit** (le colis est en route).  
3. **Arrivé au centre de tri** (le colis est trié).  
4. **En cours de livraison** (le colis est en route vers le client).  
5. **Livré** (le client a reçu son colis).  

---

## **🧩 Fonctionnalités du système**
1. **Gestion des commandes de livraison**  
   - Un client peut **créer une commande de livraison**.  
   - Le client peut **suivre la progression de la livraison**.  

2. **Cycle de vie du colis**  
   - **Prise en charge** : La commande est acceptée et le colis est enregistré.  
   - **En transit** : Le colis quitte l'entrepôt et est en route.  
   - **Arrivé au centre de tri** : Le colis arrive au centre de tri local.  
   - **En cours de livraison** : Le colis est sur la route vers le client.  
   - **Livré** : Le client reçoit le colis.  

3. **Gestion des acteurs**  
   - **MainActor** : Gère la création des commandes et la communication avec les clients.  
   - **DeliveryActor** : Gère le cycle de vie de chaque colis (un acteur par colis).  
   - **TrackingActor** : Suivi des mises à jour de statut des colis et notification au client.  

4. **Notifications**  
   - À chaque étape du cycle de vie du colis, le **client est informé**.  
   - Si la livraison échoue (timeout), une **notification d'erreur** est envoyée au client.  

---

## **📦 Les messages échangés entre les acteurs**
1. **Client -> MainActor**  
   - `PasserCommande(clientId: String, adresse: String, produit: String)` : Crée une nouvelle commande de livraison.  
   - `SuivreColis(clientId: String, colisId: String)` : Demande l'état d'un colis.  

2. **MainActor -> DeliveryActor**  
   - `LancerLivraison(colisId: String, produit: String, adresse: String)` : Crée un **DeliveryActor** pour gérer le cycle de vie du colis.  

3. **DeliveryActor -> MainActor**  
   - `StatutColis(colisId: String, etat: String)` : Informe le **MainActor** de l'état du colis.  

4. **MainActor -> TrackingActor**  
   - `EnvoyerSuivi(clientId: String, etat: String)` : Informe le **TrackingActor** du statut de la commande.  

---

## **📘 Exigences fonctionnelles**
1. Lorsqu'une **commande de livraison** est créée, un **DeliveryActor** est instancié pour gérer la commande.  
2. Chaque **DeliveryActor** passe par les états **prise en charge**, **en transit**, **tri**, **en cours de livraison** et **livré**.  
3. Si un colis reste bloqué à une étape pendant plus de 5 secondes, le système affiche un **message d'erreur** indiquant une **erreur de livraison**.  
4. **Les notifications doivent être envoyées au client** à chaque changement de statut du colis.  
5. L'**historique des états** de chaque colis doit être enregistré dans les logs.  
