package lectures.part1_basics

import lectures.part1_basics.valuesVariablesTypes.aVariable

object Expression extends App {    //this will make the application runnable in intellij, not needed to create a  main method

  val x = 1+3    //expressions

  println(1 + 3 * 4)

  //map operators include + - * / &(bitwise and) |(bitwise or) <<(left shift)  >>(right shift)  >>>(right shift with zero extension)

  println(4 == x)    //boolean expressions

  //relational operators == != < <= > >=

  println(!(1==x))    //logical negation

  //unary(boolean) operators !  &&  ||

  var y = 2
  y += 3  // these kind of operations are only applicable to var, because the value is changing. Similar : -=  *=  /=


  // INSTRUCTIONS (tell to DO something) vs EXPRESSIONS (has a VALUE)
  // expressions are executed (like java) and expressions are evaluated (like in scala)
  // if is not an instruction, it is an expression
  // if is an expressions, if a condition is true then give a value, ese give another value
  // Everything in Scala is an expression

  val aNewVariable = (aVariable = 3)   // here aNewVariable is a unit --- special in Scala, it is similar to void in other languages
  //reassigning a value in scala is a side effect (aVariable), that is side effects are those which return unit like println(), while and reassigning
  println(aNewVariable);     //the only value of this unit is ()


  // CODE BLOCK
  //below is a code block, it is surrounded by the curly braces, it will be a expression,
  // the value of the block is the value of the last expression
  //the values or variables defined inside the block are not accessible outside the block

  val aCodeBlock = {
    val a = 2
    val b = 2 + a
    if(b > 2 ) "yes" else "no"
  }

  //BEST PRACTICE
  // always try to write the expressions
  // do not write while loops in scala


  //Exercises

  // 1. What is the difference between string "hello world" and println("hello world")
  // Ans 1 : string "hello world" is a value of tye string, where println("hello world")  is an expression and gives the side effect that is the type of
  //println("hello world") is unit

  // 2. Find the value of
  val someValue={    // somevalue is a boolean and the block will return the last expression with > and value is false
  2 > 3
}
  //println(someValue)
  val someOtherValue = {    // for this code block, the value will be the last expression that is 42
    if(someValue) 239 else 89    // this expression is completely irrelevant
    42
  }
  //println(someOtherValue)

}
