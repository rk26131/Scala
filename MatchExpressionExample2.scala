object MatchExpressionExample2 {

  def matchExpression(month:String):String={
    month match {
      case "January"=>month
      case "February"|"March"|"April"|"May"|"June"|"July"|"August"|"September"|"October"|"November"|"December"=>month
      case _=>"Invalid Month"
    }
  }

  def main(args: Array[String]): Unit = {
    val Expression=matchExpression("Januar")
    print(Expression)
  }
}
