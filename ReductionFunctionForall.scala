object ReductionFunctionForall {

  def main(args: Array[String]): Unit = {

    val numbers = List("Mon","Tue","Wed","Thu","Fri")

    print(numbers.forall(_!="Monday"))


  }

}
