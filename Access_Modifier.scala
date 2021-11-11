import java.awt.Rectangle

object Access_Modifier {

  class shape(name:String){
    protected val shapename=name
    override def toString = s"My name is $shapename"
  }

  class Rectangle (l:Double,b:Double) extends shape("Rajneesh") {
    val length = l
    final val breadth =b
    override def toString = s"My name is $shapename $length, $breadth"
  }

  class Square extends Rectangle(5,4){
    private val k=1
    print(shapename,length,breadth,k)
  }

  def main(args: Array[String]): Unit = {
    val shape=new shape("Rajneesh")
    val Rect = new Rectangle(5,4)
    val squ= new Square()
    squ.toString
  }

}
