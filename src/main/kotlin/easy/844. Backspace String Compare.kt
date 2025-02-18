package easy
fun backspaceCompare(s: String, t: String): Boolean {

    var sPointer = s.length - 1
    var tPointer = t.length - 1

    while (true) {

        sPointer = movePointer(sPointer, s)
        tPointer = movePointer(tPointer, t)

        if (sPointer == -1 || tPointer == -1) {
            return sPointer == -1 && tPointer == -1
        }


        if (s[sPointer] != t[tPointer]) {
            return false
        }


        sPointer--
        tPointer--
    }
}


private fun movePointer(currentPointer: Int, string: String): Int {
    var pointer = currentPointer
    var hashes = 0
    while (pointer >= 0 && (hashes > 0 || string[pointer] == '#')) {
        if (string[pointer] == '#') {
            hashes++
        } else {
            hashes--
        }
        pointer--
    }
    return pointer
}



fun main() {

}