object HigherORderFunctionExample2 {

  def TriangleArea(height:Double,breadth:Double):Double={
    (height*breadth)/2
  }

  def RactangleArea(length:Double,width:Double):Double={
    (length*width)
  }

  def getArea(Choice:Int):(Double,Double)=>Double={
    if(Choice==1) TriangleArea
    else RactangleArea
  }

  def main(args: Array[String]): Unit = {
    val Choice=getArea(1)
    val ret=Choice(5,4)
    print(ret)
  }
}
