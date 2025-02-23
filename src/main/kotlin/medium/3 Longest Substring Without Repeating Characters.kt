package medium

fun lengthOfLongestSubstring(s: String): Int {
    var begin = 0
    var result = 0
    val memory = mutableMapOf<Char, Int>()

    for (end in s.indices) {
        memory[s[end]] = memory.getOrDefault(s[end], 0) + 1
        if (memory.size == end - begin + 1) {
            result = maxOf(result, memory.size)
        } else {
            memory[s[begin]] = memory[s[begin]]!! - 1
            memory[s[begin]]?.let { if (it == 0) memory.remove(s[begin]) }
            begin++
        }

    }
    return result
}

fun main() {
    println(lengthOfLongestSubstring("babbacb"))

}