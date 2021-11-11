object ReduceRight {

  def main(args: Array[String]): Unit = {
    val numbers=List(10,20,30,40,50,60)

    //.Reduce doesn't take the initial value and fold scan and reduce are belong to the same family
    //and it's give the output of first element of a reducer list
    print(numbers.reduceRight(_-_))//-30

    //50-60=-10
    //40-(-10)=50
    //30-50=-20
    //20-(-20)=40
    //10-40=-30
  }

}
