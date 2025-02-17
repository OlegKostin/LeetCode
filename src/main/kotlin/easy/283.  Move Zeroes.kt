package easy

fun moveZeroes(nums: IntArray): Unit {

    var writer = 0
    var pointer = 0
    for (i in 0.. nums.size-1){
        if (nums[pointer] == 0) {
            pointer++

        }
        else{
            nums[writer] =  nums[pointer]
            if (writer != pointer)
            nums[pointer] = 0
            writer++
            pointer++
        }

    }

}
fun main(){

    val tmep = intArrayOf(1)
    (moveZeroes(tmep))
    println(tmep.joinToString (separator = " "))

}