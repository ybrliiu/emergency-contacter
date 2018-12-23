package liiu.emergencyContacter.domain.contacter

trait Communicator {

  def communicate(party: ContactParty, content: ContactContent): Either[String, String]

}

