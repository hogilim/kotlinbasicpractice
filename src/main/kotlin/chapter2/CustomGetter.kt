package chapter2

//2.2.2
class Rectangle(val h: Int, val w: Int) {
    val isSquare: Boolean
        get() = h == w
}