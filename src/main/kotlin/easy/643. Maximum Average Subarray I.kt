package easy

import kotlin.math.max


fun findMaxAverage(nums: IntArray, k: Int): Double {

    var begin = 0
    var windowState = 0
    for (end in begin until k) {
        windowState += nums[end]
    }
    var result = windowState
    windowState = 0
    for (end in nums.indices) {
        windowState += nums[end]
        if (end - begin + 1 == k) {
            result = max(result, windowState)
            windowState -= nums[begin]
            begin++
        }
    }
    return result.toDouble() / k
}

fun main() {

    println(findMaxAverage(intArrayOf(-1), 1))
}