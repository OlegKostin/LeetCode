package easy

fun isPalindrome(x: Int): Boolean {
    val isSmallerThanZero = x < 0
    var temp = x
    var numReversed = 0
    while (temp >= 1) {
        numReversed = numReversed * 10 + temp % 10
        temp /= 10
    }
    return x == numReversed
}

fun main() {
    println(isPalindrome(123))
}