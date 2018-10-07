fun main(args: Array<String>) {
  val prices = mutableListOf(53.2, 48.2, 32.8)
  prices
      .asSequence()
      .map { it * 1.08 } // 引数 -> 処理
      .filter { it > 50 } // n -> n > 50
      .forEach { println(it) }

  val iterable = arrayOf(1, 2, 3, 4, 5)

  // Create a sequence with a function, returning an iterator
  val sequence1 = Sequence { iterable.iterator() }
  println(sequence1.joinToString())
  println(sequence1.drop(1).joinToString())

  // create a sequence from an existing iterator
  // can be iterated only once
  val sequence2 = iterable.iterator().asSequence()
  println(sequence2.joinToString())
//  sequence2.drop(1).joinToString() < - Error
}
