package app.tusee

import slick.jdbc.PostgresProfile.api._

import java.time.Instant

object Tables {

  class Users(tag: Tag) extends Table[(String, String, String, String, Instant, Boolean, Boolean, String)](tag, "tusee_users") {
    def userUuid = column[String]("user_uuid", O.PrimaryKey)
    def displayName = column[String]("display_name")
    def email = column[String]("email", O.Unique)
    def password = column[String]("password")
    def created = column[Instant]("created")
    def firstLogin = column[Boolean]("first_login")
    def usesTotp = column[Boolean]("uses_totp")
    def totpSecret = column[String]("totp_secret")

    def * = (userUuid, displayName, email, password, created, firstLogin, usesTotp, totpSecret)
  }

  val users = TableQuery[Users]
}
