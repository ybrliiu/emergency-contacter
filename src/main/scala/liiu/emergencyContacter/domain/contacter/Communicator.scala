package liiu.emergencyContactor.domain.contactor

trait Communicator {

  def communicate(party: ContactParty, content: ContactContent): Unit

}

