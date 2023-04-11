import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val than10: (Int) -> Unit = {if(it > 10) println("10보다 큰 수를 입력하셨습니다.") }
    than10(n)
}