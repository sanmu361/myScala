package base

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * ${DESCRIPTION}
  *
  * @author yansen
  * @create 2018-11-16 19:05
  **/
object ExceptionTest {

  def main(args:Array[String]): Unit ={

  }

  def test(): Unit ={
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>{
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }

  def test1(): Unit ={
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }
}
