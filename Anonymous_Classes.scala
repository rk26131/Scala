object Anonymous_Classes {

  // As in java Anonymous classes are a quick way to instantiate classes with abstract method

  abstract class Shape(name:String){
    val shapename = name
    override def toString = s"I am a $shapename"
    def getArea:Double
  }

  def main(args: Array[String]): Unit = {
    val shapename:Shape = new Shape("Rajneesh"){
      def getArea = 100
    }
  }

}
