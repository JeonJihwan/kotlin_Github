import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()
    val divideInt: (Int) -> Unit = {println("${it} / 4 = ${it / 4}") }
    val divideDouble: (Int) -> Unit = {println("${it} / 4.0 = ${it / 4.0}") }
    divideInt(x)
    divideDouble(x)
}