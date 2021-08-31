//helpful in minimizing a function which accepts many arguments to a function that accepts only some arguments
object PartiallyAppliedFunctionExample2 {

  def SumofTwoNumber(a:Int,b:Int):Int={
    (a+b)
  }

  def main(args: Array[String]): Unit = {
    val add=SumofTwoNumber(20,_:Int)
    print(add(20))
  }
}
