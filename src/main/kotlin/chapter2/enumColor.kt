package chapter2
// 2.11
enum class aColor {
    RED, GREEN, BLUE
}

enum class Color (val r: Int, val g:Int, val b:Int){   // 상수의 프로퍼티를 정의
    RED(255,0,0),   /// 각 상수 생성시 그에대한 프로퍼티 지정
    GREEN(0,255,0),
    BLUE(0,0,255),
    YELLOW(255,255,0),
    CYAN(75,0,105),
    VIOLET(238,130,238); // 반드시 세미콜론 사용
    fun rgb() = (r * 256 + g) * 256 + b // enum 클래스 안에서 메소드 정의
}

fun getM(color : Color) =
    when (color){
        Color.RED -> "R"
        Color.GREEN -> "G"
        Color.BLUE -> "B"
        Color.CYAN -> "C"
        else -> ""
    }

fun main(){
    println(Color.BLUE.rgb())
    println(getM(Color.GREEN))
}