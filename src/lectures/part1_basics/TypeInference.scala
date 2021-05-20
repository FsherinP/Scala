package lectures.part1_basics

class TypeInference {

  val message = "Hello world"   // here compiler interprets that message is of type string by examining the right part of the expression

  val x = 2  // x is int
  val y = x + "hai"  // int + string => y is string

  def add(x: Int) = 1 + 2    // here also compiler will add the data type of the method

  // but when it comes to recursive functions like factorial, compiler can't easily find the data type of the method

}
