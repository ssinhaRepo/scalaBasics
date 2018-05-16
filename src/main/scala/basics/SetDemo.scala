package basics

object SetDemo {
  def main(args: Array[String]): Unit = {
    val set1:Set[Int] = Set(1, 3, 5)

    for(i <- set1) {
      println(i)
    }
  }
}
