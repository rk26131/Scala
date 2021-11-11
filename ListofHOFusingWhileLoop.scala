object ListofHOFusingWhileLoop {

  def main(args: Array[String]): Unit = {
    val weekDays = List("MON","TUE","WED","THU","FRI")
    var restofweek=weekDays
    while(!restofweek.isEmpty){
      print(s"Grr...Today is ${restofweek.head}, ${restofweek.size} days left for the weekend \n")
      restofweek=restofweek.tail
    }

    restofweek=weekDays
    while(restofweek!=Nil){
      print(s"Grr...Today is ${restofweek.head}, ${restofweek.size} days left for the weekend \n")
      restofweek=restofweek.tail
    }

  }
}
