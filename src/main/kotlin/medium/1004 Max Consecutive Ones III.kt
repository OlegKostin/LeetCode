package medium

import kotlin.math.max
import kotlin.math.min



    fun longestOnes(nums: IntArray, k: Int): Int {
        var begin = 0
        var windowState = 0 //how many zeros we got
        var result = 0
        for (end in nums.indices) {
            if (nums[end] == 0) {
                windowState++
                while (windowState > k) {
                    if (nums[begin] == 0) {
                        windowState--
                    }
                    begin++
                }

            }
            result = max(result, end - begin + 1)
        }


        return result

}
fun main(){
 println(  longestOnes(intArrayOf(1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0),2))
}