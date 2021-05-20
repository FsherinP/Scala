package lectures.part1_basics

object valuesVariablesTypes extends App {

  //semicolon is allowed in Scala, but not necessary

  // Values

  val x: Int = 10      //the value of x cannot be changed again, always remains as 10  that is VALS ARE IMMUTABLE   like const or final in java n c
  println(x)

  val y = 12          // the type of val like int is optional, compiler can infer types

  val aString: String = "Hello"      //String inside double quotes
  val aBoolean: Boolean = true       //only true or false values
  val aChar: Char = 'A'             //character inside single quotes
  val aShort:Short = 12345
  val aLong: Long = 12345678909863L    //we can add as big value beyond the limit, but for that must add L at the end as in the case of float in java
  val aFloat: Float = 3.76f            //if we remove the f, then compiler will complaint that it is not float, it is a double
  val aDouble: Double =5.893;

  //Variables
  var aVariable: Int = 2   // can be reassigned
  aVariable = 5     //allowed
}
