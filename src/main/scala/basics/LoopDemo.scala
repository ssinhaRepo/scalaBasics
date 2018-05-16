package basics

object LoopDemo {
  def main(args: Array[String]): Unit = {
    var x: Int = 0;
    var y: Int = 0

    //nested for loop
    for(x <- 1 to 3; y <- 10.until(12)) {
      println("x: " + x + " y: " + y + " -> x*y = " + x*y)
    }

    //For loop with filter
    x = 0
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    //Use '{' or curly braces for multiple lines of for-loop expression, but '(' for one line expression - important for REPL env
    //val oddList = for (x <- numList if x%2 != 0; if x <= 9) yield x
    val oddList = for {x <- numList if x%2 != 0; if x <= 9} yield {
      x
    }

    x = 0
    println("One digit odd numbers:")
    for(x <- oddList) {
      print(x + ". ")
    }
    println()

    //while loop
    x = 0
    while(x < 5) {
      println("While loop: " + x)
      x += 1
    }

    x = 0
    do {
      println("do-while loop: " + x)
      x += 1
    } while (x < 5)

  }
}
