object Case_Classes {

  // The represent a way to define a class with a single line of code
  case class Person(FirstName:String,LastName:String)

  def main(args: Array[String]): Unit = {
    val person = new Person("Rajneesh","Kumar")
    person match {
      case Person("Rajneesh","Kumar") => print("You are correct")
      case x => x.FirstName
    }
  }

}
