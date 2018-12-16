package liiu.emergencyContactor.domain.contactor;

import liiu.emergencyContactor.domain.contactor.Contacter;
import liiu.emergencyContactor.domain.contactor.ContactParty;

class NotificationJob(contacter: Contacter, contactParty: ContactParty) {

  def contact(): Unit = {
    this.contacter.contact(this.contactParty)
  }

}
