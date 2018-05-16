package basics

import scala.math.{Pi, pow, sqrt}

class Ellipse (x: Int, y: Int) {
  var a: Int = x
  var b: Int = y

  def area(): Double = {
    Pi*a*b
  }

  def circumference(): Double = {
    2*Pi*sqrt((pow(a, 2) + pow(b, 2))/2)
  }
}
