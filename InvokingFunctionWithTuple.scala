import InvokingFunctionWithTuple.parameter

object InvokingFunctionWithTuple {

  def getRactange(length:Double,breadth:Double):Double={
    print(length*breadth)
    (length*breadth)
  }
  var parameter=30

  def main(args: Array[String]): Unit = {
    (getRactange _).tupled({
      val sideofSqr=parameter/4
      (sideofSqr,sideofSqr)
    })
}
}