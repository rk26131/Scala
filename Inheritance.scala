object Inheritance {

  class shape(name:String){
    val shapename = name
    override def toString = s"I am a $shapename"
  }

  class Rectangle(l:Double,b:Double,shape:String="Rectangle") extends shape("shape"){

    val length=l
    val breadth=b
    override def toString =  s"I am a $shapename, $length , $breadth"
  }

  class square(s:Double) extends Rectangle(s,s,"square"){

    //print(s)

  }

  def main(args: Array[String]): Unit = {
    val r= new square(5);
    print(r.toString)
  }

}
