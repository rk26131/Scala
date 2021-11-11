object Self_Type {

  trait A{
    this:B => print("Hello Rajneesh")
  }

  trait B {
    this:A => println("Hello Ramesh")
  }

  class n{

  }
  class person extends n with B with A{
  }
  def main(args: Array[String]): Unit = {
    val l=new person()
    print(l)

  }
}
