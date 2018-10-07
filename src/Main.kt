// null

fun main(args: Array<String>) {
//  val s: String = null
  val s: String? = null
//  println(s)

//  if (s != null) {
//    println(s.length)
//  } else {
//    println(null)
//  }

//  println(s?.length) // 上記と同様の処理
//  println(s?.length ?: -1) // null以外の表示を行いたいとき
  println(s!!.length) // nullだったときExceptionを投げる
}
