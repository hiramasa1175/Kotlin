// null

private var nStr: String = ""
private val nList = ArrayList<Long>()
private val oList = ArrayList<Char>()

fun main(args: Array<String>) {

  

}

fun calculator(): Long {
  var i = 0
  val nList = ArrayList<Long>(nList)
  val oList = ArrayList<Char>(oList)
  nList.add(nStr.toLong())
  try {
    while (i < oList.size) {
      if (oList[i] == '×' || oList[i] == '÷') {
        val result = if (oList[i] == '×') nList[i] * nList[i + 1] else nList[i] / nList[i + 1]
        nList[i] = result
        nList.removeAt(i + 1)
        oList.removeAt(i)
        i--
      } else if (oList[i] == '−') {
        oList[i] = '+'
        nList[i + 1] = nList[i + 1] * -1
      }
      i++
    }
  } catch (e: Exception) {
    println(e)
  }

  val result = nList.sum()

  return (result * 1.08).toLong()
}
