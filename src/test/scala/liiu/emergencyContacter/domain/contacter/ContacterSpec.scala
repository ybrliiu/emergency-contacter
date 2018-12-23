package liiu.emergencyContacter.domain.contacter

import org.scalatest._
import scala.collection.mutable.HashMap

class MockCommunicator extends Communicator {

  val messages: HashMap[String, String] = new HashMap

  def communicate(party: ContactParty, content: ContactContent): Either[String, String] = {
    this.messages += ( party.toString() -> content.toString() )
    Right("Success.")
  }

}

class ContacterSpec extends FlatSpec with DiagrammedAssertions {

  val contacter = new Contacter( new MockCommunicator, new ContactParty("somewhere") );

  "cummunicate method" should "通信に成功すればrightを返す" in {
    val either = contacter.contact( new ContactContent("メッセージ内容") )
    either.map( message => assert(message === "Success.") )
  }

}
