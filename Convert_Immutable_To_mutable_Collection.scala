object Convert_Immutable_To_mutable_Collection {

  def main(args: Array[String]): Unit = {

    val list = collection.immutable.List(10,20,30,40,50)
    val listbuilder = List.newBuilder[Int]

    list.foreach(listbuilder+=_)

    print(listbuilder.result)

  }
}
