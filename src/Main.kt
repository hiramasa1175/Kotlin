// data class

data class Point(val x: Int, val y: Int)

fun main(args: Array<String>) {
  val p1 = Point(3, 5)
//  val p2 = Point(3, 5)
  val p2 = p1.copy()

  println(p1)
  println(p2)
  println(if (p1 == p2) "same" else "not same")

  val (x, y) = p1
  println("$x:$y")
}