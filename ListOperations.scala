object ListOperations{

  def main(args: Array[String]): Unit = {
    // :: this is a "cons" operator
    val weekDays = "MON" :: "TUE" :: "WED" :: "THU" :: "FRI" :: Nil
    print(weekDays+"\n")
    val weekEndDays = List("SAT","SUN")
    print(weekEndDays +"\n")

    // Adding the two list
    val days1 = weekDays ::: weekEndDays
    val days2 = weekDays ++ weekEndDays
    print(days1 + "\n" +days2)

    //To create a list of tuples of the corresponding elements, use zip
    var days:List[(Int,String)] = List((1,"Mon"),(2,"Tue"),(3,"Wed"))
    print(days+"\n")

    //flatten used to combine in a one list
    val day = List(weekDays,weekEndDays).flatten
    print(day)
  }

}
