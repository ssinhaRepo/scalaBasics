package basics

object MatchExpressionDemo {
  def main(args: Array[String]): Unit = {
    var age = 200

    //match statement
    age match {
      case 20 => println(age)
      case 30 => println(age)
      case 40 => println(age)
      case 50 => println(age)

      //Default case, i.e. if assigned value of age does not match any case statement it defaults to the following
      case _ => println("default")
    }

    //match statement
    age = 20

    val matchedAge = age match {
      case 20 => age
      case 30 => age
      case 40 => age
      case 50 => age

      //Default case, i.e. if assigned value of age does not match any case statement it defaults to the following
      case _ => "default"
    }
    println("MatchedAge: " + matchedAge)

    //Match case with or
    val num = 4
    //val oddOrEven = num match {
    num match {
      case 1 | 3 | 5 | 7 | 9 => println("Odd number!")
      case 2 | 4 | 6 | 8 | 10 => println("Even number!!")
    }
    //println(oddOrEven)
  }


}
