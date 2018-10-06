// 継承
// user -> AdminUser

class AdminUser(name: String) : User(name) {
  fun sayHello() {
    println("hello $name")
  }

  override fun sayHi() {
    println("[admin] hi $name")
  }
}

open class User(var name: String) {
  open fun sayHi() {
    println("hi $name")
  }
}

fun main(args: Array<String>) {
  val bob = AdminUser("bob")
  println(bob.name)
  bob.sayHello() // hello
  bob.sayHi()

  println("")

  val hiramasa = User("hiramasa")
  println(hiramasa.name)
  hiramasa.sayHi()
}
