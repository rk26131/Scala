object Error_Handling_Util_Try {

  def main(args: Array[String]): Unit = {

    val statecodes = Map("Caliphonia"->"CA",("Rajneesh","Kumar"))

    println(statecodes("Caliphonia"))

    //println(statecodes("Cali"))

    println(util.Try(statecodes("caliphonia")))

    println(util.Try(statecodes("Caliphonia")))


  }

}
