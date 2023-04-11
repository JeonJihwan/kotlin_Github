import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    print("점수를 입력하세요. ")
    val score = nextInt()
    var grade: String
    if(score >= 90) grade = "A"
    else if(score >= 80) grade = "B"
    else if(score >= 70) grade = "C"
    else if(score >= 60) grade = "D"
    else grade = "F"
    println(grade)
}