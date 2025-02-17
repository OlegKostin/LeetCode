package easy

fun removeDuplicates(nums: IntArray): Int {
    var result = 0
    for (i in 1..nums.size - 1) {
        if (nums[i] != nums[i - 1]) {
            result++
            nums[result] = nums[i]
        }
    }
    return result + 1
}

fun main() {
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))

}