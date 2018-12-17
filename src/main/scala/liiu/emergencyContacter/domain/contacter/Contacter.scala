package liiu.emergencyContactor.domain.contactor

class Contacter(communicator: Communicator, contactParty: ContactParty) {

  def contact(content: ContactContent): Unit = {
    this.communicator.communicate(this.contactParty, content)
  }

}

