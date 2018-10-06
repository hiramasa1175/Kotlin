// 抽象クラス -> 具象クラス
// User -> Japanese, American

abstract class User {
  abstract fun sayHi()
}

class Japanese : User() {
  override fun sayHi() {
    println("こんにちは！")
  }
}

class American : User() {
  override fun sayHi() {
    println("Hi!")
  }
}

fun main(args: Array<String>) {
  val tom = American()
  val aki = Japanese()
  tom.sayHi()
  aki.sayHi()
}
