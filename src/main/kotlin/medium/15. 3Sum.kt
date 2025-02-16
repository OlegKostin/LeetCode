package medium

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
fun threeSum(nums: IntArray): List<List<Int>> {
nums.sort()
    val set = hashSetOf<List<Int>>()

    for (i in 0..nums.lastIndex) {
        val target = -nums[i]
        var left = i + 1
        var right = nums.lastIndex

        while (left < right) {
            val sum = nums[left] + nums[right]
            if (sum == target){
                set.add(listOf(target,nums[left], nums[right]))
                left++
                continue
            }
            if (sum > target){
                right--
                continue
            }
            if (sum < target){
                left++
            }

        }

    }
    return set.toList()
}

fun main(){
    threeSum(intArrayOf(-1,0,1,2,-1))

}