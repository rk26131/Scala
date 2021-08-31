import java.util.Calendar

object ByNameParameterExample2 {

  def CurrentTime()={
    val x=Calendar.getInstance().getTime().toString
    print(x)
    x
  }

  def Time(Time: =>String)={
    print("Time Method\n")
    Thread.sleep(1000)
    print(s"\nSecond time $Time\n")
  }

  def main(args: Array[String])= {
    Time(CurrentTime())
  }
}
