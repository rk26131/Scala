
object Type_Parameter {

  class Shape(name:String){
  val shapename=name
    override def toString: String = s"I am $shapename"

  }

  class AreaCalculator[T](s:T)
  {
    val shape:T=s
    override def toString = shape.toString
  }

  def main(args: Array[String]): Unit = {
    val shape = new Shape("Rajneesh")
    val a = new AreaCalculator[Shape](shape)
    print(a)
  }
}
