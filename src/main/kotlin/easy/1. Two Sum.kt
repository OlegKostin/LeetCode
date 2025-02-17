package easy


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//two pointer

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for ((index, num) in nums.withIndex()) {
        val result = target - num
        if (map.containsKey(result))
            return intArrayOf(map[result]!!, index)

        map[num] = index
    }
    return intArrayOf()
}

fun main() {

    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(nums, target)
    println(result.joinToString()) // Output: 0, 1
}
