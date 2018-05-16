package basics

object PatternMatchingDemo {
  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest("??"))
  }

  def matchTest(x: Any) = x match {
    case 1 => "one"
    case "two" => 2
    case x: Int => "scala.Int"
    case _ => "did not match anyting!"
  }
}
