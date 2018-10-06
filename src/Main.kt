// Class
// - data: property
// - fun: method

class User(var name: String) {
  var team = "red"
  init {
    println("instance created, name: $name, team: $team")
  }
  fun sayHi() {
    println("hi $name")
  }
}

fun main(args: Array<String>) {
  val tom = User("tom")
  println(tom.name)
  tom.sayHi()
  val bob = User("bob")
  println(bob.name)
  bob.sayHi()
}
