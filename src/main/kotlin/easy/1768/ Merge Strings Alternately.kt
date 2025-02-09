package easy.`1768`

import kotlin.math.max
import kotlin.math.min

class ` Merge Strings Alternately` {
}

fun mergeAlternately(word1: String, word2: String): String {
    val stringBuilder = StringBuilder()
    val maxLength = max(word1.length, word2.length)
    for (i in 0 until maxLength) {
        if (word1.length > i)
            stringBuilder.append(word1[i])
        if (word2.length > i)
            stringBuilder.append(word2[i])
    }
    return stringBuilder.toString()
}


fun main() {
    println(mergeAlternately("abc", "pqr"))
}