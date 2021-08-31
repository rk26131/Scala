object ClosureExample3 {

  def main(args: Array[String]) {
    println( "multiplier(1) value = " +  trianglearea(10) )
    println( "multiplier(2) value = " +  ractanglarea(10) )
  }
  val lenght=50
  val trianglearea = (breadth:Int) => lenght*breadth/2
  val ractanglarea= (width:Int)=>lenght*width
}
