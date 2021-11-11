object ListScan {

  def main(args: Array[String]): Unit = {

    //.scan used to traversal of a list

    val numbers=List(10,20,30,40,50,60)

    print(numbers.scan(0)(_-_))

    //10 20 30 40 50 60
    // first we take the value at initial position then we can subtract from other elements
    // 0
    // 0 -10 (0 - 10 =-10)
    // 0 -10 -20 (-10 - (20)=-30)
    // 0 -10 -20 -30 (-30-30=60)
  }
}
