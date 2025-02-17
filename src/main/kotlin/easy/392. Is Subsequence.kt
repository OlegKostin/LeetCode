package easy

fun isSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty())
        return true
    var pointer = 0
    for (i in 0..t.length - 1) {

        if (s[pointer] == t[i]) {
            pointer++
            if (pointer == s.length)
                break
        }
    }

    return pointer == s.length
}

fun main() {
    println(isSubsequence(s = "b", t = "abc"))
}