fun main(args: Array<String>) {
  print("Enter name:")
  val name = readLine()
  print("Enter age:")
  val age = readLine()!!.toInt()
  print("Enter department:")
  var dep: String?
  dep = readLine()
  print("Enter pi:")
  val pi: Double = readLine()!!.toDouble()

  println("**** output ****")
  println("name:" + name)
  println("age:" + age)
  println("department:" + dep)
  println("PI:" + pi)
}
