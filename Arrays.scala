object Arrays {

  def main(args: Array[String]): Unit = {

     val myarray = Array(1,2,3,4,5)
      val myarray1 = new Array[Int](5)
      myarray.foreach((p:(Int))=>println(p))

      for(i<-0 to myarray.length-1) {
        println(myarray(i))
      }
      for(x<-myarray)
        println(x)

  }
}
