package liiu.emergencyContacter.domain.contacter

class ContactContent(private val value: String) {

  val MAX_LENGTH = 1024

  def isAvailable: Boolean = {
    this.value.length < MAX_LENGTH
  }

  override def toString: String = {
    this.value
  }

}

