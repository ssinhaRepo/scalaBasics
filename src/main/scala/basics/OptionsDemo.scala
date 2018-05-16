package basics

object OptionsDemo {
  def main(args: Array[String]): Unit = {
    //val map1:Map[String, String] = Map("France" -> "Paris", "India" -> "Delhi")
    val capitals = Map("France" -> "Paris", "India" -> "Delhi", "Japan" -> "Tokyo")

    println("Show(capitals.get(\"India\"))" + show(capitals.get("India")))
    println("Show(capitals.get(\"Mexico\"))" + show(capitals.get("Mexico")))

    //getOrElse() : access value when present or default when not present
    val a:Option[Int] = Some(5)
    val b:Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(2): " + b.getOrElse(2))
    println("a.isEmpty: " + a.isEmpty)
    println("b.isEmpty: " + b.isEmpty)
  }

  def show(x : Option[String]) = x match {
    case Some(x) => x
    case None => "?"
  }

}
