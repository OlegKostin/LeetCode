package easy

import kotlin.math.abs


fun sortedSquares(nums: IntArray): IntArray {
val result = IntArray(nums.size)
    var right = 0
    var left = nums.lastIndex
for (i in nums.lastIndex downTo 0){
    val rightNum = abs( nums[right])
    val leftNum =abs( nums[right])
    if (rightNum > leftNum){
        result[i] = rightNum * rightNum
        right++
    }else{
        result[i] = leftNum * leftNum
        left--
    }
}
    return result
}

fun main(){
   println( sortedSquares(intArrayOf(-4,-1,0,3,10)).joinToString (separator = " "))

}
