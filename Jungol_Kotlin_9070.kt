import java.util.Scanner

fun main()=with(Scanner(System.`in`)) {
    val list = mutableListOf<Int>()
    list.add(nextInt())
    var max = list[0]
    for(i in 1..9) {
        list.add(nextInt())
        if (max < list[i]) max = list[i]
    }
    println(max)
}