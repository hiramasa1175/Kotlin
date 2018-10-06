fun main(args: Array<String>) {
  // while
  // 0..9

  var i = 0
//  var i = 100

  while (i < 10) {
    println("loop: $i")
    i++
  }

  do {
    println("loop2: $i")
    i++
  } while (i < 10)
}