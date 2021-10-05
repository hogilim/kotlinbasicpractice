package chapter2

fun recognize(c : Char) = when(c){
    in '0'..'9' -> "digit"
    in 'a'..'z', in 'A'..'Z' -> "letter"
    else -> "else"
}

fun main(){
    print(recognize('3'))
}