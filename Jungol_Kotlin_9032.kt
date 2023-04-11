import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    print("점수를 입력하세요. ")
    val score = nextInt()
    val successful: (Int) -> Unit = {if(it >= 80) println("축하합니다. 합격입니다.") else println("죄송합니다. 불합격입니다.") }
    successful(score)
}