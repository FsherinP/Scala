package lectures.part1_basics

object Functions extends App {

  //Function declaration -  def is there
  // then function name , give the parameters and its data type using : dataType
  // : returnType
  // = {block of expressions}
  // it is not necessary to add the return type of the function, but when it comes to recursive functions, there must add return type
  def aFunction(a: String, b: Int):String = {
    a + " " + b + " years old"
  }
  println(aFunction("I am",21))

  //parameterless function
  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())   //we can remove the function parenthesis while calling a parameterless function

  //Recursive function - better to write this in place of loops
  // WHEN YOU NEED LOOPS, USE RECURSION
  def aRecursiveFunction(a: String, n: Int): String = {
    if(n == 1) a
    else a + " " + aRecursiveFunction(a, n-1)
  }
  println(aRecursiveFunction("Hi",5))


  //Function with side effect
  def aFunctionWIthSideEffect(a: String): Unit = println(a)


  //Bigger functions with auxiliary functions in it
  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n-1)
  }

  println(aBigFunction(8))

  /*
  * Exercise
  *  1. A greeting function(name,age) => "Hi i am $name and i am $age years old"
  *  2. factorial function => 1*2*3*.....*n
  *  3. A fibonacci function => f(1) =1 , f(2) = 1,  f(n) = f(n-1) + f(n-2)
  *  4. Test a number is prime
  */

  // answer - 1
  def greetingFunction(name: String, age: Int):String = {
    "Hi, I am " + name + " and I am " + age + " years old"
  }
  println(greetingFunction("David",21))

  //Answer - 2
  def factorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * factorialFunction(n-1)
  }
  println(factorialFunction(5))

  //Answer - 3

  def fibonacci(n: Int): Int = {
    if(n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(8))

  // Answer - 4  it will be an auxiliary function
  def isPrime(a: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(a <=1 ) true
      else a % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(a/2)
  }
  println(isPrime(5));

  println(isPrime(2))

}
