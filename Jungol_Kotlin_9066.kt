fun main() {
    val list = mutableListOf<Char>()
    for(c in 'A'..'Z') list.add(c)
    list.asReversed().forEach{ print("${it} ") }
}