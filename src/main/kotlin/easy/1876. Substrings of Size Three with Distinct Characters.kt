package easy

fun countGoodSubstrings(s: String): Int {

    var begin = 0
    var result = 0
    val memory = mutableMapOf<Char, Int>()
    for (end in s.indices) {
        memory[s[end]] = memory.getOrDefault(s[end], 0) + 1
        if ((end - begin + 1 )== 3) {
            if (memory.size == 3) result++
            memory[s[begin]] = memory[s[begin]]!! - 1
            memory[s[begin]]?.let { if (it == 0) memory.remove(s[begin]) }
            begin++
        }
    }
    return result
}

fun main() {

    println(countGoodSubstrings("xyzzaz"))
}