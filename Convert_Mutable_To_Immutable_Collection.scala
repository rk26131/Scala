object Convert_Mutable_To_Immutable_Collection {

  def main(args: Array[String]): Unit = {

    val list = collection.mutable.ListBuffer(10,20,30,40,50)
    val map = collection.mutable.Map("Rajneesh"->30,("Ramesh",40))
    val set = collection.mutable.Set(10,20,30,40,40)

    println(list.toList)
    println(map.toMap)
    println(set.toSet)
    list.append(20)
    map.addOne("Ramesh",40)
    set.addOne(40)
    println(list)
    println(map)
    println(set)

  }
}
