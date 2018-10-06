// Class
// - data: property
// - fun: method

class User {
  var name = "Me!"
  fun sayHi() {
//    println("hi ${this.name}")
    println("hi $name")
  }
}

fun main(args: Array<String>) {
//  val user: User = User()
  val user = User() // インスタンス
  println(user.name)
  user.sayHi()
  user.name = "Me Me!"
  println(user.name)
  user.sayHi()
}
