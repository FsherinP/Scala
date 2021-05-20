package lectures.part1_basics

object Recursion extends App {

  //factorial function
  def factorial(x: Int): Int =
    if (x <=1 ) 1
    else {
      println("computing factorial of " + x + " - I first need factorial of " + (x-1))   //this is the stack frame in which the preparation for the result
      val result = x * factorial(x-1)
      println("computed factorial of " + x)  // call stack - here this will run only when the stack frame is completed and reached the base, here it is 1, the will compute 2, 3 ...

      result
    }
// that is all the preparations in recursive functions are stored into a small stack memory
  println(factorial(10))
//  println(factorial(50000))  - here this will throw stack over flow error because of the high recursive depth. THis is actually bad, we can't use recursion when
//  we want to iterate more than hundreds.
//  The solution is write code in a smarter way, that is adapt another concept for the same solution

//  def anotherRecursion (n: Int) : BigInt = {
//    def factHelper(x: Int, accumulator: BigInt): BigInt = {
//      if (x <= 1) accumulator
//      else factHelper(x-1, x * accumulator)
//
//      factHelper(n, 1)
//    }
//  }
//
//  println(anotherRecursion(5000)) // will work, because it is not storing to stack, but storing to an integer called accumulator
}
