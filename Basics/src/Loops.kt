/*
    While Do..While and For loops
    Calculate sum of first n whole numbers
 */
fun main() {
    println("Enter a number")
    val inp = readLine()!!
    var lim = inp.toLong()
    var sum = 0L
    var i = 0
    while (i <= lim) {
        sum += i
        ++i
    }
    println("Sum: $sum")

    i = 0
    sum = 0
    do {
        sum += i
        ++i
    } while(i <= lim)
    println("Sum: $sum")

    i = 0
    sum = 0
    for ( i in 0..lim step 1) {
        sum += i
    }
    println("Sum: $sum")
}