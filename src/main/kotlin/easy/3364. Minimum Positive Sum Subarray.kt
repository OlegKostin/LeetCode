package easy

import kotlin.math.min

fun minimumSumSubarray(nums: List<Int>, l: Int, r: Int): Int {
    if (nums.size < l) {
        return -1
    }
    var minSum = Int.MAX_VALUE
    for (size in l..r) {
        var sum = 0
        for (i in 0..<size) {
            sum += nums[i]
        }
        if (sum > 0) {
            minSum = min(minSum, sum)
        }
        for (i in size..<nums.size) {
            sum += nums[i]
            sum -= nums[i - size]
            if (sum > 0) {
                minSum = min(minSum, sum)
            }
        }
    }
    return if (minSum == Int.MAX_VALUE) -1 else minSum
}



fun main() {

    println(minimumSumSubarray(nums = listOf(17,13), l = 1, r = 2))
}