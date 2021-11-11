object HigherOrderFunctionMap {

  def main(args: Array[String]): Unit = {

    val weekDays=List("Mon","Tue","Wed","Thu","Fri")

    print(weekDays.map(_=="Mon"))

    val checkvalue=(x:String)=>(x=="Mon"):Boolean

    print(weekDays.map(checkvalue))
  }
}
