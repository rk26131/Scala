object HigherOrderFunctionExample1 {

  def compareString(s1:String,s2:String):Int={
    if(s1==s2) 0
    else if(s1>s2) -1
    else 1
  }

  def compareStringDescending(s1:String,s2:String):Int={
    if(s1==s2) 0
    else if(s1<s2) 1
    else -1
  }

  def getComparator(reverse:Boolean):(String,String)=>Int={
    if(reverse==true) compareString
    else compareStringDescending
  }

  def main(args: Array[String]): Unit = {
    val compar=getComparator(true)
    val ret=compar("ABC","XYZ")
    print(ret)
  }
}
