object LeftListScan {

  def main(args: Array[String]): Unit = {

    val numbers = List(10,20,30,40,50,60)

    //.scanLeft it's used to traversal from left to right

    print(numbers.scanLeft(0)(_-_))

    //10 20 30 40 50 60
    // first we take the value at initial position then we can subtract from other elements
    // 0
    // 0 -10 (0 - 10 =-10)
    // 0 -10 -20 (-10 - (20)=-30)
    // 0 -10 -20 -30 (-30-30=60)

  }

}
