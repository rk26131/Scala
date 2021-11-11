object Set1 {

  def main(args: Array[String]): Unit = {

    val pair = Set("Rajneesh","Kumar","Ramesh","Kumar")

    print(pair)

    println(pair.contains("Ramesh"))

    pair.foreach((p: (String)) => println(p))

    val name = List("Rajneesh","Ramesh","Suresh")

    print(name.toSet)
  }
}
