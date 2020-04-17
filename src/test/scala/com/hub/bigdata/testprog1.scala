package com.hub.bigdata

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object testprog1 extends App {
//val spark = SparkSession.builder().appName("my first app1").master("local").getOrCreate()

  val conf = new SparkConf().setAppName("my first app").setMaster("local")
  val sc = new SparkContext(conf)

  val arr = Array("bijay","madhu","viswa","santosh")
  println( "Thrid element in array is :" + arr(0))
  /*for(y <- 1 to 8)
    {
      println{s"y: $y"}
    }*/


  /*var result = fact(5)
  println(result)
  def fact(x: Int) : Int = {

    if(x ==0 ) 1
    else {
      x * fact(x-1)
    }

  }*/



  /*val rdd1 = sc.parallelize(Array(1,2,3,4,5,6,7))
  val rdd2 = rdd1.map(r => r*r)
  rdd2.foreach(r => println(r))*/
/*var capital = Map("Orissa" -> "bhubanseswar", "karnataka" -> "bangalore" )
   capital += ("maharastra" -> "Mumbai")

  capital.foreach(rec => println(rec))*/

}
