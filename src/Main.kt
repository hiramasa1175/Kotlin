// generics

class MyInteger {
  fun getThree(x: Int) {
    println(x)
    println(x)
    println(x)
  }
}

class MyData<T> {
  fun getThree(x: T) {
    println(x)
    println(x)
    println(x)
  }
}

fun main(args: Array<String>) {
  val mi = MyInteger()
  mi.getThree(55)

  println()

  val i = MyData<Int>()
  i.getThree(32)
  val s = MyData<String>()
  s.getThree("hello")
}
