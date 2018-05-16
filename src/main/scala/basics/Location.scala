package basics

class Location (override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x += dx
    y += dy
    z += dz

    println("Point x location: " + x)
    println("Point y location: " + y)
    println("Point z location: " + z)

  }
}
