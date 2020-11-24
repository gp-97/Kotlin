// when replaces switch statements in Kotlin
fun main() {
    println("Enter an operator")
    val op = readLine()
    val a = 5
    val b = 10
    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> println(a / b)
        else -> {
            println("Unknown operator")
        }
    }
}
