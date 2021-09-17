package chapter2
// 2.3
import kotlin.IllegalArgumentException

interface Expr
class Num(val value:Int) : Expr
class Sum(val left:Expr, val right : Expr) : Expr

fun eval(e: Expr): Int{
    if(e is Num){
        return e.value
        val n = e as Num    // 타입변경. 불필요한 중복임.
        return n.value
    }
    if(e is Sum){
        return eval(e.right) + eval(e.left) // e에 대한 스마트 캐스트 사용.
    }
    throw IllegalArgumentException("Unknown expression")
}
fun eval1(e:Expr) :Int =
    if(e is Num){
        e.value
    }else if(e is Sum){
        eval(e.left) + eval(e.right)
    }
    else{
        throw IllegalArgumentException("Unknown expression")
    }

fun eval2(e:Expr) :Int =
    when(e) {
        is Num ->   // 인자 타입을 검사하는 when의 분기
            e.value
        is Sum ->
            eval(e.left) + eval(e.right)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }
fun main(){
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
}