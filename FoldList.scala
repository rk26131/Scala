object FoldList {

  def main(args: Array[String]): Unit = {

    var numbers = List(10,20,30,40,50,60)

      //.fold it's get the at the last to right most element by using scan list
    print(numbers.fold(0)(_-_))
  }
}
