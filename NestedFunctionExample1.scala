object NestedFunctionExample1 {

  def getCircleStated(r:Double)={
    val pi=3.14
    def getCircleArea(r:Double)=pi*r*r
    def getcircleCircumference(r:Double)=2*pi*r
    (getCircleArea(r),getcircleCircumference(r))
  }

  def main(args: Array[String]): Unit = {
    val x=getCircleStated(5)
    print(x)
  }
}
