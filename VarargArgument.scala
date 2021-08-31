object VarargArgument {

  def varargArg(strings:String*)={
    var builtString=""
    for (S <- strings){
      builtString=builtString+" "+S
    }
    builtString
  }

  def varargArg(intvalue:Int*)={
    var count=0
    for(s <- intvalue){
      count+=s
    }
    count
  }
  def main(args: Array[String]): Unit = {
    val string=varargArg("Hello","Rajneesh","How","Are","You")
    print(string)
    val intval=varargArg(1,2,3,4)
    print(intval)
  }
}
