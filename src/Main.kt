// Collection
/*
 - List (Immutable/Mutable)
 - Set (Immutable/Mutable)
 - Map (Immutable/Mutable)
*/

fun test(): List<String> {
  val temp = listOf("1", "2", "3")
  return temp
}

fun main(args: Array<String>) {
  val sales1 = listOf(20, 30, 40)
  val sales2 = mutableListOf(20, 30, 40)

  println(sales1)
  println(sales2)

  sales2[1] = 50

  println(sales1)
  println(sales2)

  println(sales1.size)

  for (sale in sales1) {
    println(sale)
  }

  for (sale in sales2) {
    println(sale)
  }

  println(test())

}