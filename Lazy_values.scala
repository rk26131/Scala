object Lazy_values {

  class lazyvalue(l:Double,b:Double){
    val length=l
    val breadth = b
    val getArea = {println("Initialising a variable"); println(length*b*5); println("Hello mr.");}
    lazy val parameter = {println("Initialising a variable"); 2*length*breadth}
  }

  def main(args: Array[String]): Unit = {

    val laz = new lazyvalue(5,4);
    println(laz)
    println(laz.parameter)

  }

}
