object PartiallyAppliedFunctionExample1 {

  def compareString(s1:String,s2:String):Int={
    if(s1==s2) 0
    else if(s1>s2) -1
    else -1
  }

  def smartCompare(s1:String,s2:String,CompFn:(String,String)=>Int):Int={
    CompFn(s1,s2)
  }

  def main(args: Array[String]): Unit = {
    val compare=smartCompare(_:String,_:String,compareString)
    print(compare("ABC","XYZ"))
  }
}
