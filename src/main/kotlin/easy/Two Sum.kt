package easy

fun twoSum(nums: IntArray, target: Int): IntArray {

    for (i in 0..nums.lastIndex) {
        for (j in 0..nums.lastIndex) {
            if (i != j && nums[i] + nums[j] == target)
                return intArrayOf(i, j)
        }
    }
    return nums
}


