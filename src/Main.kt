// アクセス修飾子
// - public どこからでも
// - protected そのクラス＋サブクラス
// - private そのクラス

class AdminUser(name: String) : User(name) {
  fun sayHello() {
    println("hello $name")
  }

  override fun sayHi() {
    println("[admin] hi $name")
  }
}

open class User(protected var name: String) {
  open fun sayHi() {
    println("hi $name")
  }
}

fun main(args: Array<String>) {
  val bob = AdminUser("bob")
//  println(bob.name)
  bob.sayHello() // hello
  bob.sayHi()
}
