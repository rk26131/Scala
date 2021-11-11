object Map1 {

  def main(args: Array[String]): Unit = {

    val pair = Map("Ajay" -> 30,
      ("Bhavesh" , 20),
      "Charlie" ->40)

    //we can get the value using key
    print(pair("Ajay"))

    //the key is present or not
    print(pair.contains("Ajay"))

    //to get the key and value pair using foreach
    pair.foreach((p: (String, Int)) => println(p._1 + " = " + p._2))

    //map convert from a list
    val name = List("Rajneesh","Ramesh","Suresh")
    val age = List(21,48,50)
    val nameage1 = (name zip age).toMap
    print(nameage1)

    //convert to a list
    val name1 = nameage1.keySet.toList
    val age1 = nameage1.values.toList
    print(name1)
    print(age1)
  }
}
