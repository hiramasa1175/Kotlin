fun main(args: Array<String>) {
  // when
  val num = 100

  when (num) {
    0 -> println("Zero")
    1 -> println("One")
    2, 3 -> println("Two or Three")
    in 4..10 -> println("Many")
    else -> {
      println("other")
      println("hello world!")
    }
  }

//  val result = when (num) {
//    0 -> "Zero"
//    1 -> "One"
//    2, 3 -> "Two or Three"
//    in 4..10 -> "Many"
//    else -> {
//      "Other"
//      "Hello World!"
//    }
//  }
//
//  println(result)
}