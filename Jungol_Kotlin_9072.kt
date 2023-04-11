import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val list = mutableListOf<Int>()
    var sum = 0
    for(i in 0..9) {
        list.add(nextInt())
        sum += list[i]
    }
    println("총점 = $sum")
    println("평균 = ${sum / list.size.toDouble()}")
}