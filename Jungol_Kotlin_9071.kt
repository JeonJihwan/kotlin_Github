import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val list = mutableListOf<Int>()
    var max: Int = -1000
    var min: Int = 1000
    for(i in 0..9) {
        list.add(nextInt())
        if(list[i] % 2 == 0 && list[i] > max) max = list[i]
        if((list[i] % 2 == 1 || list[i] % 2 == -1) && list[i] < min) min = list[i]
    }
    println("$min $max")
}