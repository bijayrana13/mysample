package com.hub.bigdata

object implicitClass {
  def main(args: Array[String]): Unit = {
    case class Foo(i:Int)

    implicit def FooToInt(foo: Foo) : Int = foo.i

    println(Foo(40) + 2)
  }

}
