package basics

object ListDemo {
  def main(args:Array[String]): Unit = {
    //Array demo
    var arr1 = new Array[Int](3)
    //var arr2 = Array("one", "two", "three")
    var arr2:Array[String] = Array("zero", "one", "four")

    for(i <- 0 until 3) {
      arr1(i) = i*i
      println(arr2(i))
    }

    for (i <- arr1) {
      println(i)
    }
  }

  //List Demo , very similar to array, but unlike array it's immutable and linked-list (arrays are flat)
  val fruit:List[String] = List("apple", "orange", "banana")
  val fruits = "graphs" :: ("pear" :: ("mango" :: Nil))
  val emptyList:List[Nothing] = List()
  val nilList = Nil
  //2-D list
  val twoDList:List[List[Int]] =
    List(
      List(1, 2, 3),
      List(4, 5, 6),
      List(7, 8, 9)
    )
  val twoDimList = (10::(20::(30::(40::Nil)))) ::
                   (50::(60::(70::Nil))) ::
                   (80::(90::Nil)) :: Nil

  println("head of fruits: " + fruits.head)
  println("Empty fruit list? " + fruit.isEmpty)
  println("head of twoDList: " + twoDList.head)
  println("tail of twoDimList: " + twoDimList.tail)
  //var fruitLists =  fruit:::fruits
  //var fruitLists =  fruit.:::(fruits)
  var fruitLists =  List.concat(fruit, fruits)
  println("two fruit lists:" + fruitLists)

  val repeatList = List.fill(4)("mango")
  println(repeatList)

  val tabulateList = List.tabulate(5)(n => n*3)
  println(tabulateList)
  println("reverse list: " + tabulateList.reverse)





}
