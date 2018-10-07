// Collection

/*
- List (Immutable/Mutable)
- Set (Immutable/Mutable)
- Map (Immutable/Mutable)
 */

fun main(args: Array<String>) {
//  val answers: Set<Int> = setOf(5, 3, 8, 5)
  val answers = setOf(5, 3, 8, 5)
  val answers2 = mutableSetOf(5, 3, 8, 5)

  println(answers)
  println(answers2)

  answers2.add(15)
  answers2.remove(3)

  println(answers)
  println(answers2)

  println(answers.contains(3)) // true

  val set1 = setOf(1, 3, 5, 8)
  val set2 = setOf(3, 5, 8, 9)
  println(set1.intersect(set2))
  println(set1.union(set2))
  println(set1.subtract(set2))
}