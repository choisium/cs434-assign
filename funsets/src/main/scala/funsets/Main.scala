package funsets

object Main extends App {
  import FunSets._
  val s: Set = singletonSet(1)
  println(contains(s, 1))
  println(contains(s, 2))
}
