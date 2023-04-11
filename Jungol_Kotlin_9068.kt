import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var list = mutableListOf<Int>(100)
    var i = 2;
    list.add(nextInt())
    while (i++ <= 100 && list[i] != 0 ) list.add(nextInt())
    list.removeLast()
    for(i in 2..list.size step(2)) print("${list[i]} ")
}