package basics

object FunctionByName {
  def main(args: Array[String]): Unit = {
    delayed(time())
  }

  def time(): Long = {
    println("getting time in nano-seconds...")
    System.nanoTime()
  }

  //Note the function argument in scala style: define a function with retun type
  def delayed(t: => Long): Unit = {
    println("In method deplayed...")
    println("Params: " + t)
  }
}
