package com.hub.bigdata

object testprog2 {
  def main(args: Array[String]): Unit = {

    val myMap = Map("Santosh" -> 30)

    def addMap(name: String, age : Int) : Unit = {

      val newMap = myMap + (name -> age)
      val sortMap = newMap.toSeq.sortBy(x => x._1)
            //newMap.foreach(x => println(x))
      println(newMap)
    }

    addMap("Bijay",35)

  }



}
