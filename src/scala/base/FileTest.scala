package base

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

/**
  * ${DESCRIPTION}
  *
  * @author yansen
  * @create 2018-11-16 19:33
  **/
class FileTest {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt" ))

    writer.write("菜鸟教程")
    writer.close()
  }

  def test(): Unit ={
    print("请输入菜鸟教程官网 : " )
    val line = StdIn.readLine()

    println("谢谢，你输入的是: " + line)
  }

  def test1(): Unit = {
    println("文件内容为:")

    Source.fromFile("test.txt").foreach {
      print
    }
  }
}
