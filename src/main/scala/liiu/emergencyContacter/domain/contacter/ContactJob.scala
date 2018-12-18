package liiu.emergencyContacter.domain.contacter

class NotificationJob(private val contacter: Contacter) {

  def contact(content: ContactContent): Either[String, String] = {
    this.contacter.contact(content)
  }

}
