package easy


fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var pointer1 = m - 1
    var pointer2 = n - 1
    var lenght = m + n - 1
    while (pointer2 >= 0 && pointer1 >= 0) {
        if (nums1[pointer1] > nums2[pointer2]) {
            nums1[lenght] = nums1[pointer1]
            pointer1--

        } else {
            nums1[lenght] = nums2[pointer2]
            pointer2--
        }
        lenght--
    }
    while (pointer2 >= 0) {
        nums1[lenght] = nums2[pointer2]
        pointer2--
        lenght--
    }
}


fun main() {
    merge(nums1 = intArrayOf(4, 5, 6, 0, 0, 0), m = 3, nums2 = intArrayOf(1, 2, 3), n = 3)

}