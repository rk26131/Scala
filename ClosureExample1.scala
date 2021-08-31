import java.util.Calendar

object ClosureExample1 {

  def gretting(lang:String)={
    val currdate=Calendar.getInstance().getTime().toString
    lang match{
      case "English" => (x:String) => print("Hello "+x+" . It is "+currdate)
      case "Hindi" => (x:String) => print("Hello "+x+" . It is "+currdate)
      case "French" => (x:String) => print("Hello "+x+" . It is "+currdate)
      case "Spanish" => (x:String) => print("Hello "+x+" . It is "+currdate)
    }
  }

  def main(args: Array[String]): Unit = {
    val grettingEnglish = gretting("English")
    grettingEnglish("Swetha")

    val grettingHindi = gretting("Hindi")
    grettingHindi("Janani")

    val grettingFrench = gretting("French")
    grettingFrench("Delphine")

    val grettingSpanish = gretting("Spanish")
    grettingHindi("Alejandro")
  }
}
