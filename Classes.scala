object Classes {

  class Rectangle(l:Double,b:Double)// These values are known as class parameter - think of them as parameter to the default constructor
  {

    val length=l;// The class parameter can be used to initialise fields (values and variable inside a class)
    val bredth=b;

    def getArea:Double=l*b
    override def toString: String = s"I am a ractangle , l=$length , b=$bredth"

  }

  def main(args: Array[String]): Unit = {

    val rect = new Rectangle(4,5)
    println(rect)
    val rectlist = List(new Rectangle(3,4),rect)
    println(rectlist)

    println(rectlist.map(_.getArea))

    println(rectlist.foreach((x:Rectangle)=>{println(x)}))

  }
}
