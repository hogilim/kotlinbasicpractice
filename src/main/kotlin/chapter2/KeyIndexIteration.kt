package chapter2

fun main(){
    val list = arrayListOf<String>("10", "11", "1001")
    for((index, element) in list.withIndex()){
        println("${index} : ${element}")
    }
}