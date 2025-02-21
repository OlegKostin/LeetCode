package medium

import kotlin.math.max

fun longestSubarray(nums: IntArray): Int {
    var begin = 0
    var windowState = 0 //how many zeros we got
    var result = 0
    for (end in nums.indices) {
        if (nums[end] == 0) {
            windowState++
            while (windowState > 1) {
                if (nums[begin] == 0) {
                    windowState--
                }
                begin++
            }
        }
        result = max(result, end - begin + 1)
    }
    return result -1

}