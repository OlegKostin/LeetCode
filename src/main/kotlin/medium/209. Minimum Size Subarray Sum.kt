package medium

import kotlin.math.max
import kotlin.math.min

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var begin = 0
    var windowState = 0
    var result = Int.MAX_VALUE
    for (end in nums.indices) {
        windowState += nums[end]
        while (windowState >= target) {
            result = min(result, end - begin + 1)
            windowState -= nums[begin]
            begin++
        }
    }
    return if (result == Int.MAX_VALUE) 0 else result
}

fun main() {
    println(minSubArrayLen(7, intArrayOf(2, 3, 1, 2, 4, 3)))
}