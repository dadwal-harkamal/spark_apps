import checkSumAccumulator.calculate

object summer{
  def main(args: Array[String]) {
  for (arg <- args)
    println( arg + ":" + calculate(arg))
}
}