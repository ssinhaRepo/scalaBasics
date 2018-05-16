package basics

object SingletonDemo {
  def main(args: Array[String]) {
    val coordinate = new Coordinate(10, 20)
    printPoint

    def printPoint{
      println ("Point x location : " + coordinate.x);
      println ("Point y location : " + coordinate.y);
    }
  }
}
