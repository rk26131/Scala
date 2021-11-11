object RightListScan {

  def main(args: Array[String]): Unit = {

    val numbers = List(10, 20, 30, 40, 50, 60)

    //.scanRight It's used to traversal from right to left

    print(numbers.scanRight(0)(_-_))

    // first we take 0 on right hand side
    //then we subtract from rest of the element in the list
    //                            0
    //                        60  0  (60-0=60)
    //                    -10 60  0  (50-60=-10)
    //                50             (40-(-10)=50)
    //          -20                  (30-50=-20)
    // -30 40 -20 50 -10 60 0
  }

}
