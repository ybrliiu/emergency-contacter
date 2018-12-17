package liiu.emergencyContactor.domain.contactor

class NotificationJob(contacter: Contacter) {

  def contact(content: ContactContent): Unit = {
    this.contacter.contact(content)
  }

}
