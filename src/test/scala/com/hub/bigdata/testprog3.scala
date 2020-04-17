package com.hub.bigdata

object testprog3 {
  def main(args: Array[String]): Unit = {

    // a,b,c,
    // 0,1,1,2,3,5,8,13
   def fibN( n : Int) : Unit = {
     var a = 0
     var b = 1
     var i = 0
println(a)
      println(b)
     while (i < n) {
       val c = a + b
        a = b
        b = c
        i = i + 1
      // var c = d
       println(c)
     }
   }
    fibN(10)

  }

}
