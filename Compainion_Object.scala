object Compainion_Object {

  private val username="Vitthal"
  private val password = "boo"

  def apply() = new Compainion_Object

  def main(args: Array[String]): Unit = {
    val com = new Compainion_Object()
    com.toString
  }
}
class Compainion_Object{
  //Rules of Companion Object
  // Object name and class name must be same
  // Object and Class name must be in same file
  // they both are can be access the private and protected data to each other
  private val accountDetails = Map("User" -> Compainion_Object.username , "password" -> Compainion_Object.password)
  print(s"Hi. "+accountDetails("User"))
}

