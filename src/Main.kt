import java.lang.StringBuilder

var test = "1000+2000+10000"

fun main(args: Array<String>) {
  println(toStringWithSeparator("1000"))
}

fun toStringWithSeparator(str: String, appe: String = ""): String {
  var result = str + appe
  result = result.replace(",", "")
  var strBuil = StringBuilder().append(result)
  var count = 0
  for ((index, value) in strBuil.withIndex().reversed()) {
    if (value in '0'..'9') count++ else count = 0
    if (count == 3) {
      strBuil = strBuil.insert(index, ",")
      count = 0
    }
  }

  return strBuil.toString()
}
