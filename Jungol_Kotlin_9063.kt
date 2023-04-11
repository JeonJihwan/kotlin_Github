import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var list = mutableListOf<Int>()
    for(i: Int in 0..4) {
        list.add(nextInt())
        print("${list[i]} ")
    }
}