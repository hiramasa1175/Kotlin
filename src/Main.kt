// Interface

interface Sharable {
  // 抽象プロパティ
  val version: Double
  // 抽象メソッド
  fun share()
  // メソッド
  fun getInfo() {
    println("Share I/F ($version)")
  }
}

class User: Sharable {
  override val version = 1.1
  override fun share() {
    println("Sharing...")
  }
}

fun main(args: Array<String>) {
  val user = User()
  user.share()
  user.getInfo()
}
