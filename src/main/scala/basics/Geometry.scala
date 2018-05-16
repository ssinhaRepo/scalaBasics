package basics

import scala.math.{Pi, pow, sqrt}

class Geometry(xc: Int, yc: Int) {
  var x: Int = xc;
  var y : Int = yc;

  def length: Double = {
    sqrt(x*x + y*y);
  }

  def area() {
    println("Area of the circle is: " + Pi*pow(length, 2));
  }

}
