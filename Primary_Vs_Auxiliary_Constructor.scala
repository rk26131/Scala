object Primary_Vs_Auxiliary_Constructor {

  class Rectangle(l:Double,b:Double){
    // This behave like a primary constructor because of we have initialized parameter and initialized variable inside class
    val length:Double=l
    val breadth =b
    def this(s:Double) = this(s,s)// we using this keyword it's behave like a auxiliary constructor invoked by the primary constructor
  }

  class Rectangle1(l1:Double,b1:Double=1){//b behave like a auxiliary constructor because primary constructor is a default constructor {
  val length1:Double=l1
  val breadth1 =b1
  def area:Double=l1*b1
  }

}
