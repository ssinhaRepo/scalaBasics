package basics

import java.util.Date

import scala.math.log

object ScalaFunctionsDemo {
  def main(args: Array[String]): Unit = {
    var i: Int = 0
    val n: Int = 10

    for (i <- -1 to 5) {
      println(i + "! = " + factorial(i))
    }

    printStrings("Sourabh", "Ayesha", "Saana", "Shimba")

    println("n*ln(n!) for n = " + n + ": " + nLogFactN(factorial, n))

    //Function leterals/Anonymous function
    var mul = (x: Int, y: Int) => x*y
    println("Scala function leteral demo: " + mul(3, 7))

    //Function leteral/Anonymous function with no parameter
    var userDir = () => {System.getProperty("user.dir")}
    println(userDir)

    //partially bind the parameters for logMessage function
    val logWithDateBound = logMessage(new Date, _ : String)
    logWithDateBound("message1")
    Thread.sleep(1000)

    logWithDateBound("message2")
    Thread.sleep(1000)

    logWithDateBound("message3")
    Thread.sleep(1000)

    //Currying or function chaining
    println(strCat("Scala")("version: ")(2.11))

    //Closures: a function whose return value depends on the variable declared outside the function
    var factor = 3
    val multiplier = (j : Int) => j*factor

    println("multiplier(2) = " + multiplier(2))
    println("multiplier(5) = " + multiplier(5))

  }

  //Currying or function chaining
  def strCat(s1: String)(s2: String)(s3: Double) = s1+s2+s3
  // or, def strCat(s1: String) = (s2: String) = (s3: Double) => s1 + s2 + s3

  //Functions with variable arguments
  def printStrings(args:String*) = {
    var i: Int = 0

    for(arg <- args) {
      println("[ " + i + "th] Arg value = " + arg)
      i += 1
    }
  }

  //Recursive functions
  def factorial(n: Int): Int = {
    if(n <= 1) {
      1
    } else {
      n*factorial(n-1)
    }
  }

  //Higher order functions or function of a function or functionals
  def nLogFactN(f: Int => Double, n: Int) = {
    n*log(f(n))
  }

  //Partially applied function
  def logMessage(date: Date, message: String) = {
    println(date + "-----" + message)
  }

}
