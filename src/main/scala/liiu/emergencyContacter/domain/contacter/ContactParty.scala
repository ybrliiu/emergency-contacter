package liiu.emergencyContacter.domain.contacter

class ContactParty(private val value: String) {

  val MAX_LENGTH = 256

  require( value.length < MAX_LENGTH )

  override def toString: String = {
    this.value
  }
  
}

