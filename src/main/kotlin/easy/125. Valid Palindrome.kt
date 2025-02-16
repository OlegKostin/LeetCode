package easy

fun isPalindrome(s: String): Boolean {
    val charArray = s.lowercase().toCharArray()
    var left = 0
    var right = charArray.size - 1
    while (left <= right) {
        if (!charArray[left].isLetterOrDigit()) {
            left++
            continue
        }
        if (!charArray[right].isLetterOrDigit()) {
            right--
            continue
        }
        if (charArray[right] != charArray[left]) {
            return false
        }else{
            right--
            left++
        }

    }
    return true
}

fun main(){
    println(isPalindrome( "race a car"))
}