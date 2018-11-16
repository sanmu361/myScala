package base

/**
  * ${DESCRIPTION}
  *
  * @author yansen
  * @create 2018-11-16 18:40
  **/
object MatchTest {

  def main(args: Array[String]): Unit = {
    println(matchTest(3))

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for( p <- List(alice,bob,charlie)){
     matchTest1(p)
    }
  }

  def matchTest(i: Int):String = i match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  def matchTest1(p:Person): Unit =p match{
    case Person("Alice",25) => println("Hi Alice!")
    case Person("Bob",32) => println("Hi Bob!")
    case Person(name,age) => println("Age:" + age + "year,name:" + name + "?")
  }

}

case class Person(name:String,age:Int)
