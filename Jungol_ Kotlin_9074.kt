import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val count: MutableList<Int> = MutableList(11) { 0 }
    while(true) {
        val n = nextInt()
        if(!(n in 1..10)) break
        count[n] += 1

    }
    for (i in 1..10)
        if(count[i] != 0)
            println("$i : ${count[i]}개")
}