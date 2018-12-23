import com.github.jurajburian.mailer._
import javax.mail.internet.InternetAddress

object main extends App {
  val session = SessionFactory()
    .append( SmtpAddress("smtp.gmail.com", 587) )
    .append( Property("mail.smtp.starttls.enable", "true") )
    .session( Some("raian@reeshome.org", "******") )
  val content = new Content().text("Test Call")
  val msg = Message(
    from    = new InternetAddress("raian@reeshome.org"),
    subject = "my subject",
    content = content,
    to      = Seq(new InternetAddress("*****"))
  )
  val mailer = Mailer(session)
  try{ mailer.send(msg) }
}
