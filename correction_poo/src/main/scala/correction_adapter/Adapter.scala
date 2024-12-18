package correction_adapter

trait SmsService {
  def sendSms(number: String, message: String): Unit
}

class EmailService {
  def sendEmail(email: String, subject: String, body: String): Unit = {
    println(s"📧 Envoi d'un e-mail à $email avec le sujet '$subject' et le corps : $body")
  }
}

class NotificationAdapter(emailService: EmailService, phoneToEmailMapping: Map[String, String]) extends SmsService {
  override def sendSms(number: String, message: String): Unit = {
    phoneToEmailMapping.get(number) match {
      case Some(email) =>
        emailService.sendEmail(email, "Notification", message)
      case None =>
        println(s"⚠️ Aucune correspondance e-mail trouvée pour le numéro $number")
    }
  }
}

object NotificationSystem {
  def main(args: Array[String]): Unit = {
    val phoneToEmailMapping = Map(
      "0601020304" -> "client1@example.com",
      "0605060708" -> "client2@example.com",
      "0708091011" -> "client3@example.com"
    )

    val emailService = new EmailService()
    val notificationAdapter: SmsService = new NotificationAdapter(emailService, phoneToEmailMapping)

    notificationAdapter.sendSms("0601020304", "Votre commande a été expédiée.")
    notificationAdapter.sendSms("0605060708", "Votre facture est disponible.")
    notificationAdapter.sendSms("0708099999", "Votre colis est en route.")
  }
}

