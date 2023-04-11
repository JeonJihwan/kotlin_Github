private var i = 0
fun name(s: String?) {
    if(i == 3) return
    println(s)
    i++
    return name(s)
}

fun main() {
    name("홍길동")
    var n = 10
    if(n>10) { n = 10;n = 20;return }
}