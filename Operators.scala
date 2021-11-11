object Operators {

  class complexNumber(r:Double, i :Double){
    val realPart = r
    val imaginaryPart = i
    val realpart1=r
    val imaginaryPart1 = i
    def +(that:complexNumber):complexNumber= {
      //print(i)
      new complexNumber(this.realPart+that.realPart,this.imaginaryPart+that.imaginaryPart)
    }

    def -(that:complexNumber):complexNumber= {
      new complexNumber(this.realpart1-that.realpart1,this.imaginaryPart1-that.imaginaryPart1)
    }

    override def toString = s"($realPart, $imaginaryPart),($realPart, $imaginaryPart)"

  }

  def main(args: Array[String]): Unit = {
    val c1=new complexNumber(5,10)
    val c2 = new complexNumber(1,3)
    val c3=c1+c2
    print(c3)
    print(c1-c2)
  }

}
