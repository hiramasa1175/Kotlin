// Collection

/*
- List (Immutable/Mutable)
- Set (Immutable/Mutable)
- Map (Immutable/Mutable)
 */

fun main(args: Array<String>) {
//  val users: Map<String, Int> = mapOf("test1" to 40, "test2" to 50, "test3" to 60)
//  val users = mapOf("test1" to 1, "test2" to 2, "test3" to 3)
  val users = mutableMapOf("test1" to 1, "test2" to 2, "test3" to 3)

  println("users[test1] = " + users["test1"])
  println(users.entries)
  users["test1"] = 0
  users["test2"] = 1
  users["test3"] = 2

  println("users.size = " + users.size)
  println("users.keys = " + users.keys)
  println("users.values = " + users.values)
  println("users.entries = " + users.entries)
}