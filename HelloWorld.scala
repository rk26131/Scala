object HelloWorld {

  def main(args: Array[String]){
      print("Hello World");
      val dayofweek ="Monday";
      val typeoftheDay = dayofweek match{
        case "Tuesday" =>"Tuesday"
        case someOtherDay=>{
          print(s"Today is neither monday or tuesday $someOtherDay")
          someOtherDay
        }
      }
      def getArea(r:Double,PI:Double=3.14)={
        def getcircleArea(r:Double)=PI*r*r
        def getCircleCircumfrence(r:Double)=2*PI*r
        (getcircleArea(r),getCircleCircumfrence(r))
      }

    def polymorphism[K,V](k:K,v:V): Unit ={
      val keytype=k.getClass
      val valuetype=v.getClass
      print(s"$k, $v are types of $keytype, $valuetype")
    }

    def concatString(strings:String*)={
      var buildString=""
      for(s<-strings) buildString=buildString+" "+s
      buildString
    }
    def compateString(s1:String,s2:String,Compfn:(String,String)=>Int)={
      Compfn(s1,s2)
    }
    def compareString(s1:String,s2:String):Int={
      if(s1>s2) -1
      else if(s1==s2) 0
      else 1
    }
  }
}
