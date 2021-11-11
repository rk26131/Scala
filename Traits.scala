object Traits {

  abstract class Animal{
    def speak
  }

  trait FourLeggedAnimal{
    def walk
    def run
  }

  trait waggingTail{
    def starttail = {println("StartTail")}
    def stoptail ={print("Stop tail")}
  }
  class Dog extends Animal with FourLeggedAnimal with waggingTail{
    def speak ={println("Hello Rajneesh")}

    override def walk: Unit = {println("I am going to shimla")}

    override def run: Unit = {println("I am running ")}
  }

  def main(args: Array[String]): Unit = {
    val dog=new Dog()
    dog.speak
    dog.walk
    dog.run
    dog.starttail
    dog.stoptail
  }
}
