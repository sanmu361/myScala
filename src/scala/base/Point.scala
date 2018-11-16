package base

/**
  * ${DESCRIPTION}
  *
  * @author yansen
  * @create 2018-11-16 18:29
  **/
class Point(xc:Int, yc:Int) extends Equal {
    var x:Int = xc;
    var y:Int = yc;

  override def isEqual(x: Any): Boolean = {
    x.isInstanceOf[Point] && x.asInstanceOf[Point].x == this.x
  }
}

object Test{
  def main(args:Array[String]): Unit ={
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}
