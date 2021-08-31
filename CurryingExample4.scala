object CurryingExample4 {

  def AddNumber(a:Int)(b:Int,c:Int):Int={
    (a+b+c)
  }

  def main(args: Array[String]): Unit = {
    var check=AddNumber(_:Int)(5,4)
    print(check(5)+"\n")
    check = AddNumber(5)(_:Int,8)
    print(check(9)+"\n")
    check = AddNumber(7)(9,_:Int)
    print(check(11))
  }

}
