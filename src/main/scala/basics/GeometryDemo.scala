package basics

object GeometryDemo {
  def main(args: Array[String]): Unit = {
    val geom: Geometry = new Geometry(3, 4);

    println("Length between the points: " + geom.length);
    geom.area();
  }
}
