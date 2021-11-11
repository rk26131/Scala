object CollectionwithTuples {

  def main(args: Array[String]): Unit = {
    //Tuples are enclosed with parentheses
    val personInfo = ("Vitthal", "Shrinivasan",30,"M")

    //To access a element in tuple based on a position
    print(personInfo._1+"\n")
    print(personInfo._2)

    //pairs can be created with a special notations
    val genderPair = "Vitthal" -> "M"
    print("\n"+genderPair)

    //To access a element of a tuple using variables
    val (firstname,lastname,age,gender)=personInfo
    print(firstname)

    //if you care about some tuple elements but not others
    val (firstname1,lastname1,_,gender1)=personInfo

    //Iterating over tuples
    //The number of elements:productArity
    print(personInfo.productArity)

    //Passing tuples to function
    print("\n Passing tuples to function \n ")
    def PrintPersonGender(name:String,Gender:String)={
      print(s"Name:$name,M/F:$Gender")
    }
    (PrintPersonGender _).tupled(genderPair)


  }
}
