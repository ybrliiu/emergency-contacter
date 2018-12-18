package liiu.emergencyContacter.domain.contacter

trait Communicator {

  def canCommunicate(party: ContactParty, content: ContactContent): Boolean = {
    content.isAvailable && party.isAvailable
  }

  def communicate(party: ContactParty, content: ContactContent): Either[String, String]

}

