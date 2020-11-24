fun main() {

    // Immutable
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(numbers.size)

    for (i in numbers)
        print(i.toString() + "\t")
    println()

    numbers.forEach { number -> print(number.toString() + "\t") }
    println()

    numbers.forEachIndexed { index, number -> println("numbers[$index] = $number")  }

}