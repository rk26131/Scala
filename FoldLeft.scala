object FoldLeft {

  def main(args: Array[String]): Unit = {
    val numbers=List(10,20,30,40,50,60)

    //.foldLeft is used to give the output at the last of element by using scan

    print(numbers.foldLeft(0)(_-_))
  }
}
