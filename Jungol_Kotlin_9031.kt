import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt(); val b = nextInt()
    val max = if(a > b) a else b; val min = if(a <= b) a else b
//    val prt: (Int, Int) -> Unit = {x, y -> println("입력받은 수 중 큰 수는 ${x}이고 작는 수는 ${y}이다.") }
    val prt: (Int) -> (Int) -> Unit = {{y -> println("입력받은 수 중 큰 수는 ${it}이고 작는 수는 ${y}이다.") }}
    prt(max)(min)
}