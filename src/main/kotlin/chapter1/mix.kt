package chapter1
import chapter2.Color
import chapter2.Color.*

fun mix(c1:Color, c2:Color) {
    when(setOf(c1, c2)){
        setOf(RED,GREEN) -> YELLOW
        setOf(GREEN,BLUE) -> CYAN
        setOf(RED, BLUE) -> VIOLET
        else -> throw Exception("Dirty color")
    }
}

fun mixOptimized(c1:Color, c2:Color){
    when{
        (c1 == RED && c2 == GREEN) ||
                (c2 == RED && c1 == GREEN)
            -> YELLOW
        // .....
        else -> throw Exception("Dirty color")
    }
}