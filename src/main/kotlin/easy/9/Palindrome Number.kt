package easy.`9`

fun isPalindrome(x: Int): Boolean {
    val temp =  x.toString()
return temp == temp.reversed()

}

fun main() {
    println(isPalindrome(123))
}