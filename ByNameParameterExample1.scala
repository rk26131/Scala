object ByNameParameterExample1 {

  def voteforMrTrump(x:String):String={
    print("Vote for Mr Trump Method\n")
    x
  }
  //"name:=>String if you call this with a function,that function will be evaluated only and each time the parameter is referenced "
  def sayHelloToTrump(name: =>String)={
    print("Meet the President\n")
    print(s"$name\n")
    name
  }


  def sayHelloToTrump1(name:String)={
    print("Meet the President\n")
    print(s"$name\n")
    name
  }
  def main(args: Array[String]): Unit = {
    sayHelloToTrump(voteforMrTrump("Rajneesh"))
    print("Second Function")
    sayHelloToTrump1(voteforMrTrump("Rajneesh"))
  }
}
