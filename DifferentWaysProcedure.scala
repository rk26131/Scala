object DifferentWaysProcedure {

  def printHello=print("printHello function with equal and return statement\n")
  def printHello1{print("printHello function without equal statement")}

  def main(args: Array[String]): Unit = {
    printHello
    printHello1
  }
}
