object PlaceHolder {

  //Is Spacial Number Like a normal function
  def IsSpecialNumber(firstName:String,LastName:String):Boolean={
    firstName=="Rajneesh" && LastName=="Kumar"
  }

  //IsVip function behave like higher order function because IsHighStatus function behave like a first class
  def IsVIP(firstName:String,LastName:String,IsHighStatus:(String,String)=>Boolean):Boolean={
    IsHighStatus(firstName,LastName)
  }
  def main(args: Array[String]): Unit = {
    val bool=IsVIP("Rajneesh","Kumar",IsSpecialNumber)
    print(bool)
  }
}
