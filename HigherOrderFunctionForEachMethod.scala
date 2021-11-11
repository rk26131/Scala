object HigherOrderFunctionForEachMethod{

  def main(args: Array[String]): Unit = {
    val weekDays=List("Mon","Tue","Wed","Thu","Fri")
    weekDays.foreach(println(_))

    val printvalue=(x:String)=>println(x)
    weekDays.foreach(printvalue)
  }
}
