// 例外処理

class MyException(message: String) : Throwable(message)

fun div(a: Int, b: Int) {
  try {
    if (b < 0) {
      throw MyException("not minus!")
    }
    println(a / b)
  } catch (e: ArithmeticException) {
    println(e.message)
  } catch (e: MyException) {
    println(e.message)
  } finally {
    println(" -- end -- ")
  }
}

fun main(args: Array<String>) {
  div(3, 0)
  div(3, -3)
}
