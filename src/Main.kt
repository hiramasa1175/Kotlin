import java.lang.StringBuilder
import java.math.BigDecimal

var test = 11_000

fun main(args: Array<String>) {
  for (off in 1..99) {
    val off2 = 0.01 * off
    val off3 = (1.0 - off2)
    val result = (test * off3).toFloat()

    println(result.toInt())
  }
}
