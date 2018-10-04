fun main(args: Array<String>) {
  // if
  val score = 81
  // > >= < <= == !=
  if(score > 80) {
    println("Great!")
  } else if(score > 60) {
    println("Good!")
  } else {
    println("so so ...")
  }

  val result = if(score > 80) "Great!" else "so so ..."
  println(result)
}