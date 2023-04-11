fun boolToInt(b: Boolean) = if (b) 1 else 0

fun main() {
    val a: Int = 0
    val b: Int = 1
    val c: Int = 2
    val bool: (Int, Int) -> Unit = {x, y -> print("${boolToInt(!x.equals(0) && !y.equals(0))} ") }
    val bool2: (Int, Int) -> Unit = {x, y -> print("${boolToInt(!x.equals(0) || !y.equals(0))} ") }
    val bool3: (Int) -> Unit = {x -> print("${boolToInt(x.equals(0))} ") }
    bool(a, b)
    bool2(a, b)
    bool(b, c)
    bool3(a)

}