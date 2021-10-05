package chapter2

import java.io.BufferedReader
import java.io.StringReader

fun readNum(reader : BufferedReader){
    val number = try {  // 이 식의 값이 try 식의 값이 된다.
        Integer.parseInt(reader.readLine())
    }catch (e: NumberFormatException){
        return
    }
    println(number)
}

fun main(){
    readNum(BufferedReader(StringReader("Not number"))) // 아무것도 출렫되지 않는다.
}