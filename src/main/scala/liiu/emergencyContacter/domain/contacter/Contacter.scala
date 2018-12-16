package liiu.emergencyContactor.domain.contactor;

import liiu.emergencyContactor.domain.contactor.ContactParty;

trait Contacter {

  def contact(contactParty: ContactParty): Unit

}

