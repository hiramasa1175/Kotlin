// Class
// - data: property
// - fun: method

class User(var name: String) {
  var team = "red"
    // getter
    get() = field.toUpperCase()
    // setter
    set(value) {
      if (value != "") {
        field = value
      }
    }

  fun sayHi() {
    println("hi $name")
  }
}

fun main(args: Array<String>) {
  val tom = User("tom")
  println(tom.team)
  tom.team = "blue"
  println(tom.team)
  tom.team = ""
  println(tom.team)
}
