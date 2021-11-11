object FoldRight {

  def main(args: Array[String]): Unit = {

    val numbers=List(10,20,30,40,50,60)

    //.foldRight is used to give the first of the element by using scan

    print(numbers.foldRight(0)(_-_))

  }
}
