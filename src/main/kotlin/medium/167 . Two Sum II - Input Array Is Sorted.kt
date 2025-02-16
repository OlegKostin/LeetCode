package medium


fun twoSum(numbers: IntArray, target: Int): IntArray {
    var right = 0
    var left = numbers.size - 1

    while (right < left) {
        if (target < numbers[left] + numbers[right])
            left--
        else if (target > numbers[left] + numbers[right])
            right++
        else {
            right++
            left++
            return intArrayOf(right, left)
        }
    }


    return intArrayOf()
}

fun main() {
    val remp = twoSum(intArrayOf(2, 3, 4), 6)
    for (i in remp) {
        println(i)
    }
}
//fun twoSum(numbers: IntArray, target: Int): IntArray {
//
//    val map = mutableMapOf<Int, Int>()
//
//    for ((index, num) in numbers.withIndex()) {
//        val result = target - num
//        if (map.containsKey(result)) {
//            val temp = index + 1
//            val temp1 = map[result]!! + 1
//            return intArrayOf(temp1, temp)
//        }
//        map[num] = index
//
//    }
//    return intArrayOf()
//}
