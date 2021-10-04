package chapter2
import java.util.*

fun main() {
    val binaryReps: TreeMap<Char, String> = TreeMap()
    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }
    for((l,b) in binaryReps){
        println("$l = $b")
    }
}