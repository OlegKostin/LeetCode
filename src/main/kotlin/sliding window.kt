import kotlin.math.max
import kotlin.math.min

//Задача: Максимальная сумма подмассива длины K
//Дан массив целых чисел nums и целое число k. Найди максимальную сумму подмассива длины k.

fun maxSum(nums: IntArray, k: Int): Int {
    var begin = 0
    var windowState = 0
    for (i in 0 until k) {
        windowState += nums[i]
    }
    var result = windowState
    for (end in k until nums.size) {
        windowState += nums[end]
        windowState -= nums[begin]
        begin++
        result = max(result, windowState)
    }
    return result
}

// Найти минимальную сумму подмассива длины k.
fun minSun(nums: IntArray, k: Int): Int {
    var begin = 0
    var windowState = 0
    for (i in 0 until k) {
        windowState += nums[i]
    }
    var result = windowState
    for (end in k until nums.size) {
        windowState += nums[end]
        windowState -= nums[begin]
        begin++
        result = min(result, windowState)
    }
    return result
}

//Дан массив nums и число S. Нужно найти минимальную длину подмассива, сумма которого ≥ S. Если такого подмассива нет, вернуть 0.
fun minSubArrayLen(s: Int, nums: IntArray): Int {
    var begin = 0
    var windowState = 0

    var minLength = Int.MAX_VALUE
    for (end in nums.indices) {
        windowState += nums[end]
        while (windowState >= s) {
            minLength = min(minLength, end - begin + 1)
            windowState -= nums[begin]
            begin++
        }
    }
    return if (minLength == Int.MAX_VALUE) 0 else minLength
}

//Дан массив nums и число S. Найди максимальную длину подмассива, сумма которого ≤ S. Если такого подмассива нет, верни 0.
fun maxSubArrayLen(s: Int, nums: IntArray): Int {
    var begin = 0
    var windowState = 0
    var maxLength = 0
    for (end in nums.indices) {
        windowState += nums[end]
        while (windowState > s) {

            windowState -= nums[begin]
            begin++
        }
        maxLength = maxOf(maxLength, end - begin + 1)
    }
    return maxLength
}

//Дан массив nums и число S. Нужно найти количество подмассивов, у которых сумма ≤ S.
fun maxSubArrayNum(s: Int, nums: IntArray): Int {
    var begin = 0
    var windowState = 0
    var result = 0
    for (end in nums.indices) {
        windowState += nums[end]
        while (windowState > s) {
            windowState -= nums[begin]
            begin++
        }
        result += (end - begin + 1)
    }
    return result
}


fun main() {
    println(

    )

}