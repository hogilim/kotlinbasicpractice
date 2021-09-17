package chapter2
//2.2
/*
fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
}*/

fun main(args: Array<String>){
    println("Hello, ${if(args.size > 0) args[0] else "Kotlin"}!")
}