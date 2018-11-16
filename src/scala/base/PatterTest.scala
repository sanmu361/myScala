package base

import scala.util.matching.Regex

/**
  * ${DESCRIPTION}
  *
  * @author yansen
  * @create 2018-11-16 18:51
  **/
object PatterTest {
  def main(args:Array[String]): Unit ={
    val patter = "Scala".r

    var patter1 = new Regex("(S|s)cala")

    var patter2 = "(S|s)cala".r

    val pattern = new Regex("abl[ae]\\d+")

    val str = "Scala is Scalable and cool"

    val str1 = "ablaw is able1 and cool"

    println(patter findFirstIn(str))

    println((patter1 findAllIn(str)).mkString(","))

    println(patter replaceFirstIn(str,"Java"))

    println((pattern findAllIn str1).mkString(","))
  }
}
