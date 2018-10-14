import java.lang.StringBuilder

var test = "100+200000+10000"

fun main(args: Array<String>) {
  println(toStringWithSeparator(test, "1"))
}

fun toStringWithSeparator(str: String, appe: String = ""): String {
  var result = str + appe
  result = result.replace(",", "")
  var strBuilder = StringBuilder().append(result)
  var count = 0
  for ((index, value) in strBuilder.withIndex().reversed()) {
    if (value in '0'..'9') count++ else count = 0
    if (count == 3 && index != 0) {
      if (strBuilder[index - 1] in '0'..'9')
        strBuilder = strBuilder.insert(index, ",")
      count = 0
    }
  }

  return strBuilder.toString()
}
