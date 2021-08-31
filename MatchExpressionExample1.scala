object MatchExpressionExample1 {

  def MatchExpression(day:String)={
    day match{
      case "Monday"=>print(s"Today is $day")
      case "Tuesday"|"Wednesday"|"Thrusday"|"Friday"|"Saturday"=>print(s"Today is $day")
      case someotherday if someotherday==day=>print(s"$someotherday")
      day
    }
  }

  def main(args: Array[String]): Unit = {
    MatchExpression("OtherDay")
  }
}
