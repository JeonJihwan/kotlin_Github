import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var list = mutableListOf<Int>(10)
    for(i in 1..10) {
        list.add(nextInt())
        if(i == 3 || i == 5 || i == 10) print("${list[i]} ")
    }
}