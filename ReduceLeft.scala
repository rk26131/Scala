object ReduceLeft {

  def main(args: Array[String]): Unit = {
    val numbers=List(10,20,30,40,50,60)

    //.ReduceLeft doesn't take the initial value and fold scan and reduce are belong to the same family
    //and it's give the output of top most element of a reducer list
    print(numbers.reduceLeft(_-_))//-190

    //10-20 = -10
    //-10-30=-40
    //-40-40=-80
    //-80-50=-130
    //-130-60=-190
  }
}
