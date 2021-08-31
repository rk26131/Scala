object HigherOrderFunctionExample3 {

  def HigherOrderFunction(x:Int=>Int,a:Int,b:Int):Int={
    val l=a+b
    x(l)
  }

  def main(args: Array[String]): Unit = {
  val l=HigherOrderFunction(x=>x,5,4)
  print(l)
  }
}
