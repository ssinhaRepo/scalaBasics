package basics

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val alice = Person("Saana", 6)
    val bob = Person("Rehaan", 2)
    val adam = Person("Adam", 7)

    for (person <- List(alice, bob, adam)) {
      person match {
        case Person("Saana", 6) => println("Hi Saana!")
        case Person("Rehaan", 2) => println("Hi Rehaan!")
        case Person("Adam", 10) => println("Hi Adam!")
        case Person(name, age) => println("Name: " + name + ", Age: " + age + "?")
      }
    }
  }

  case class Person(name: String, age: Int)
}
