package chapter2

fun fizzBuzz(i: Int) : String = when{
    i % 15 == 0 -> "fizzbuzz"
    i % 3 == 0 -> "fizz"
    i % 5 == 0 -> "buzz"
    else -> "${i}"
}

fun main(){
    val oneToHundred = 1..100
    for(i in oneToHundred){
        print(fizzBuzz(i) + " ")
    }
    val hundredToOne = 100 downTo 1 step 2
    for(i in hundredToOne){
        print(fizzBuzz(i) + " ")
    }
}