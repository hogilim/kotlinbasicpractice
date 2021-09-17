package chapter1

data class Person(val name:String, val age:Int?=null)   // 데이터 클래스, 파라미터 디폴트

fun main(args: Array<String>){          // 최상위 함수
    val persons = listOf(Person("a"), Person("b",29))
    val oldest = persons.maxByOrNull {it.age?:0}    // 람다식, 엘비스 연산자
    println("oldest person is :$oldest")    // 문자열 템플릿
}
// 결과 toString 자동생성