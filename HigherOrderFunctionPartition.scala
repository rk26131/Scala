object HigherOrderFunctionPartition {

  def main(args: Array[String]): Unit = {
    val weekDays=List("Mon","Tue","Wed","Thu","Fri")

    //.partition takes a predicate and returns 2 list elements that not satisfy and those that don't

    println(weekDays.partition(_!="Mon"))

    val printvalue = (x:String)=>(x!="Mon")

    println(weekDays.partition(printvalue))
  }
}
