import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = nextDouble()
    val b = nextDouble()
    val sumInt1: (Double, Double) -> Unit = {x, y -> print("${(x + y).toInt()} ") }
    val sumInt2: (Int, Int) -> Unit = {x, y -> print("${x + y} ") }
    sumInt1(a, b)
    sumInt2(a.toInt(), b.toInt())

}