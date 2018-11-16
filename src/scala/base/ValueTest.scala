package base

/**
  * ${DESCRIPTION}
  *
  * @author yansen
  * @create 2018-11-12 17:22
  **/
object ValueTest {
  def main(args:Array[String]){
    var myVar: String = "test";
    var myVar1 = "test1";

    val myVal = "my val";
    println(myVar)
    println(myVar1)
    println(myVal)

    val i,j = 1L;

    println(i)
    println(j)
  }
}
