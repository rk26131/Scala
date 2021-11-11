object Default_Method_Apply {

  class lazyvalue(l:Double,b:Double){
    val length=l
    val breadth = b
    val getArea = {println("Initialising a variable"); println(length*b*5); println("Hello mr.");}
    lazy val parameter = {println("Initialising a variable"); 2*length*breadth}
  }

  class DefaultMethod(s:lazyvalue){

    def apply = s.length*s.breadth
  }

  def main(args: Array[String]): Unit = {
    val lazy_values= new lazyvalue(5,4)
    val rect = new DefaultMethod(lazy_values)
    println(rect.apply)
  }
}
