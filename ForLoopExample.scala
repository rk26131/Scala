object ForLoopExample {

  def loopExample(dayofweeklist:List[String])={
    for (day <- dayofweeklist){
      print(day+"\n")
    }
    print("---------While looop---------")
    var x=0
    while(x<dayofweeklist.size-1){
      print(dayofweeklist(x)+"\n")
      x=x+1
    }
  }

  def main(args: Array[String]): Unit = {
    loopExample(List("Mon","Tue","Wed","Thu","Fri"));
  }
}
