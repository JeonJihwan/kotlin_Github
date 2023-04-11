import java.util.*

private var i = 1

fun req(n: Int) {
    print("${i} ")
    if(i == n) return
    i++
    return req(n)
}

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    req(n)
}