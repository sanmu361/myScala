package base

/**
  * ${DESCRIPTION}
  *
  * @author yansen
  * @create 2018-11-16 18:28
  **/
trait Equal {
  def isEqual(x:Any):Boolean
  def isNotEqual(x:Any):Boolean = !isEqual(x)
}
