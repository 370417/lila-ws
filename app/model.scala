package lichess.ws

case class User(id: User.ID) extends AnyVal

object User {
  type ID = String
}

case class Sri(value: String) extends AnyVal