package lectures

object Expressions extends App{
    val x = 1
    println(x)

    println(2 + 9 * 1)
    // Operators in Scala
    // + - * / & | ^ << >> >>> (right shift with zero extension)

    println(3 == x)
    // Boolean Operators in Scala
    // == != > >= < <=

    println(!(4 == x))
    // ! && ||

    var aVariable = 5
    aVariable += 3 // Also works with -= *= /=
    println(aVariable)

    // Instructions (Do something) vs Expressions (Give me the value of something)

    // IF Expression
    val aCondition = false
    val aConditionValue = if(aCondition) 6 else 9 // IF Expression
    println(aConditionValue)
    println(if(aCondition) 4 else 1)
    println(2+2)

    //While Loop
    var i = 0
    while(i<10){
      println(i)
      i += 1
    }
    // Do not use while loop in Scala
    // Everything in Scala is an Expression

    val aWierdValue = (aVariable = 7) // Returns >> Unit === Void
    println(aWierdValue)
    // Side effects: println(), while, reassigning of variables >> all return unit

    // Code Blocks
    val aCodeBlock = {
      val x = 2
      val y = x + 3
      if (y > 2) "Hello!" else "Goodbye"
    }
//
    // Difference between String "Hello World" and println("Hello World")
                    // Value of type String         side effect of type unit(expression)

    val someValue = {
      4 > 3
    }
    println(someValue)

    val someOtherValue = {
      if(someValue) 23 else 32
    }
    println(someOtherValue)

}
