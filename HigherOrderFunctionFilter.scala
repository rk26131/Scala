object HigherOrderFunctionFilter {

  def main(args: Array[String]): Unit = {

    val weekDays=List("Mon","Tue","Wed","Thu","Fri")

    //.filter takes a predicate and returns each element in the list that satisfies the predicate A function that returns true and false

    println(weekDays.filter(_!="Mon"))

    val printvalue = (x:String)=>(x!="Mon")

    println(weekDays.filter(printvalue))
  }
}
