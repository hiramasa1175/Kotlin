
import java.text.NumberFormat

fun main(args: Array<String>) {
  val str = "1,000+1,000"
  val value = toStringWithNotSeparator(str)
  println(value.toStringWithSeparator())
}

fun Int.toStringWithSeparator() = "%,d".format(this)

fun toStringWithNotSeparator(str: String): Int {
  val n : Int

  val number = NumberFormat.getInstance().parse(str)
  n = number.toInt()

  return n
}
