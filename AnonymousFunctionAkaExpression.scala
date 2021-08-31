object AnonymousFunctionAkaExpression {

  def compareString(s1:String,s2:String):Int={
    if(s1==s2) 0
    else if(s1>s2) -1
    else 1
  }

  def main(args: Array[String]): Unit = {
    val compare=compareString _
    print(compare("ABC","XYZ"))
  }
}
