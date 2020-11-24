import java.util.Scanner
tailrec fun calcFactorial(num: Long, a: Long): Long {
    if (num == 0L)
        return a
    return calcFactorial(num-1, num*a)
}
fun main() {
    println("Enter number")
    val scObj = Scanner(System.`in`)
    val a: Long = 1
    val lim = scObj.nextLong()
    println("$lim! = " + calcFactorial(lim, a))
}
