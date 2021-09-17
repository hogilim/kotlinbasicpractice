package chapter2

fun max1(a: Int, b:Int): Int{
    return if (a>b) a else b
}

fun max(a: Int, b: Int) = if (a>b) a else b

fun main(){
    println(max(3,1))
    val a :Int
    a = 1
    print(a)
}