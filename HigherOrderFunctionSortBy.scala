object HigherOrderFunctionSortBy {

  def main(args: Array[String]): Unit = {
    val weekDays=List("Mon","Tue","Wed","Thu","Fri")

    //.SortBy takes a function and sort the function element based on it

    println(weekDays.sortBy(_(1)))//1 is a every element index value
  }
}
