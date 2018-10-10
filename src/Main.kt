private val nList = ArrayList<Long>()
private val oList = ArrayList<Char>()

fun main(args: Array<String>) {
  nList.add(10)
  nList.add(10)
  oList.add('-')

  nList.add(10)
  oList.add('*')

  nList.add(10)
  oList.add('+')

  nList.add(10)
  oList.add('*')

  println(calculator2())
}

fun calculator(): Long {
  var i = 0
  val nList = ArrayList<Long>(nList)
  val oList = ArrayList<Char>(oList)
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

  return nList.sum()
}

fun calculator2(): Long {

  oList
      .filter { it == '*' || it == '/' }
      .map {
        val i = oList.indexOfFirst { it == '*' ||  it == '/'}
        val result = if (it == '*') nList[i] * nList[i + 1] else nList[i] / nList[i + 1]
        nList[i] = result
        nList.removeAt(i + 1)
        oList.removeAt(i)
      }
  oList
      .filter { it == '-' }
      .map {
        val i = oList.indexOfFirst { it == '-'}
        val result = nList[i] - nList[i + 1]
        nList[i] = result
        nList.removeAt(i + 1)
        oList.removeAt(i)
      }

  return nList.sum()
}
