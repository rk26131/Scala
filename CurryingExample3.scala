object CurryingExample3 {

  def compareString(s1:String,s2:String):Int={
    if(s1==s2) 0
    else if(s1>s2) -1
    else 1
  }

  def smartCompr(compFn:(String,String)=>Int)(s1:String,s2:String):Int={
    compFn(s1,s2)
  }

  def main(args: Array[String]): Unit = {
    val check=smartCompr(compareString)(_:String,_:String)
    print(check("ABC","XYZ"))
  }
}
