package basics

object EllipseDemo {
  def main(args: Array[String]): Unit = {
    val ellipse = new Ellipse(2, 3)

    println("Area of this ellipse is: " + ellipse.area())
    println("Peremeter of the ellipse is: " + ellipse.circumference())
  }

}
