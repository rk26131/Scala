object ReductionFunctionEndsWith {

  def main(args: Array[String]): Unit = {

    val weekDays = List("Mon","Tue","Wed","Thu","Fri")
    val EndDays = List("Sat","Sun")
    val alldays = weekDays ++ EndDays

    println(alldays.endsWith(EndDays))

    print(alldays endsWith EndDays)

  }
}
