object AbstractClasses {

  abstract class Shape(name:String){
    val shapename=name
    override def toString = s"I am a $shapename Hello"
    def getArea:Double
  }

  class Rectangle(l:Double,b:Double,shapeName:String="Rectangle") extends Shape(shapeName){
    val length=l
    val bredth=b
    override def toString = s"I am a $shapename , l=$length , b=$bredth"
    def getArea:Double = l*b
  }

  class square(d:Double) extends Rectangle(d,d,"Square"){
    print(d)

  }

  def main(args: Array[String]): Unit = {
    val shape1 = new Rectangle(4,4)
    println(shape1)
    println(shape1.toString)
    // val shape = new Shape("Rectangle")
    val shape:Shape=new square(5)
    print(shape)
  }

}
