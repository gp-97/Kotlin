fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { number -> print(number.toString() + "\t") }
    println()

    val mutNumbers = mutableListOf(1, 2, 3, 4, 5)
    mutNumbers.add(6)
    for (idx in mutNumbers.indices) {
        print(mutNumbers[idx].toString() + "\t")
    }
    println()

    mutNumbers.add(7)
    mutNumbers.forEach {number -> print(number.toString() + "\t")}
    println()

}