package basics

import java.io.{FileNotFoundException, FileReader, IOException}

object ExceptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("file.txt")
    } catch {
        case ex: FileNotFoundException => {
          println("Missing file!")
        }
        case ex: IOException => {
          println("IO Exception!")
      }
    } finally {
      println("Exiting finally...")
    }
  }
}
