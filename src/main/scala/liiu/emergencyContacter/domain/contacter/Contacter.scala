package liiu.emergencyContacter.domain.contacter

class Contacter(
  private val communicator: Communicator,
  private val contactParty: ContactParty
) {

  def contact(content: ContactContent): Either[String, String] = {
    this.communicator.communicate(this.contactParty, content)
  }

}

