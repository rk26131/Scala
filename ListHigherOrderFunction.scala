object ListHigherOrderFunction {

  def main(args: Array[String]): Unit = {

    val weekDays = List("MON","TUE","WED","THU","FRI")

    //.head returns the first of element from a list
    //.tail returns the rest of element from a list
    print(weekDays.head+"\n")
    print(weekDays.tail+"\n")

    //.size return a size
    //.reverse reverse a list
    print(weekDays.size+"\n")
    print(weekDays.reverse+"\n")

    //.contains test a specific element if it is exist then will return true otherwise false
    print(weekDays.contains("MON")+"\n")//infix dot notation
    print(weekDays contains "Mon" +"\n")//operator notation

    //.distinct remove duplicate element
    var weekdays1=weekDays:::weekDays
    print(weekdays1+"\n")
    print(weekdays1.distinct+"\n")

    //.drop return starting of a index to element
    weekdays1=weekdays1.drop(2)
    print(weekdays1+"\n")
    weekdays1=weekdays1 drop 2
    print(weekdays1+"\n")

    //.slice stay the element between start and end
    weekdays1=weekdays1.slice(1,5)
    print(weekdays1+"\n")

    //.splitAt returns the 2 new list
    println(weekDays.splitAt(2))

    //.take return the new list starting at the head
    println(weekDays.take(2))

    //.sorted returns a new list sorted in natural order
    println(weekDays.sorted)//It sorted by alphabetically

    val digit=List(1,2,3,4,6,5,7)
    println(digit.sum)

    println(digit.product)

    println(digit.min)

    println(digit.max)
  }
}
