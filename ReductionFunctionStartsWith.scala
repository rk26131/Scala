object ReductionFunctionStartsWith {

  def main(args: Array[String]): Unit = {

    val weekDays = List("Mon","Tue","Wed","Thu","Fri")
    val EndDays = List("Sat","Sun")
    val alldays = weekDays ++ EndDays

    println(alldays startsWith weekDays)
    print(alldays.startsWith(weekDays))
  }
}
