import scala.collection.mutable.Map

class checkSumAccumulator {
  private var sum =0
  def add(b:Byte) {sum += b}
  def checksum():Int = { ~(sum & 0XFF) +1}
  
}

object checkSumAccumulator {
  private val cache = Map[String,Int]()
  def calculate(s:String):Int={
    if (cache.contains(s)) cache(s)
    else
    {
      val acc = new checkSumAccumulator
      for ( c <- s)
        acc.add(c.toByte)
        val cs = acc.checksum()
        cache += (s -> cs)
        cs
    }
    
  }
}