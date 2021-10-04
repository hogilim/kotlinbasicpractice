package chapter2

fun isLetter(c : Char) = c in 'A'..'Z' || c in 'a'..'z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun main(){
    println(isLetter('h'))
    println(isNotDigit('0'))
}