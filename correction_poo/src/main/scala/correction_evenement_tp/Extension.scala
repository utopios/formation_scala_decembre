package correction_evenement_tp

sealed trait Command
case class PasserCommande(clientId: String, adresse: String, produit: String) extends Command
case class SuivreColis(clientId: String, colisId: String) extends Command
case class LancerLivraison(colisId: String, produit: String, adresse: String) extends Command
case class StatutColis(colisId: String, etat: String) extends Command
case class EnvoyerSuivi(clientId: String, etat: String) extends Command
case class CommandeEchouee(colisId: String, raison: String) extends Command