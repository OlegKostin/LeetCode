package medium

import kotlin.math.min

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var result = 0
    while (left < right) {
        val temp = min(height[left], height[right]) * (right - left)
        if (temp > result)
            result = temp
        if (height[right] < height[left])
            right--
        else
            left++
    }

    return result
}

fun main() {
    println(maxArea(intArrayOf(8, 7, 2, 1)))
}