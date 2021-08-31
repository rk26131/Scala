object ClosureExample2 {

  //Closure function Nested Function+Local Variable
  var a=4
  val sum=(b:Int)=>b+a

  def main(args: Array[String]): Unit = {
    print(sum(5))
  }
}
