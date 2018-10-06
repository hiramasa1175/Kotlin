// 拡張
fun User.sayHello() {
  println("hello $name")
}

val User.myName: String
  get() = "I am $name"

class User(var name: String) {
  fun sayHi() {
    println("hi $name")
  }
}

fun main(args: Array<String>) {
  val tom = User("tom")
  tom.sayHello() // hello tom
  tom.sayHi() // hi tom
  println(tom.myName) // i am tom
}
