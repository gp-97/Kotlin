/*
Program to calculate telephone bill

time: minutes
cost: dollars

Fixed cost: $50
0 <= time < 10 : Rate = 5% of Fixed cost
10 <= time < 20 : Rate = 10% of Fixed cost
20 <= time < 50 : Rate = 15% of Fixed cost
time >= 50 : Rate = 20% of Fixed cost
 */
import java.util.Scanner
fun main() {
    val fixedCost: Double = 50.0
    println("Enter usage time")
    val input = Scanner(System.`in`)
    val time = input.nextDouble()
    var totalCost: Double = 0.0

    /*if (time >= 0 && time < 10) {
        totalCost += time * 1.05
    }
    else if (time >= 10 && time < 20) {
        totalCost +=  10 * 1.05 + (time - 10) * 1.10
    }
    else if (time >= 20 && time < 50)
        totalCost += 10 * (1.05 + 1.10) + (time - 20) * 1.15
    else
        totalCost += 10 * (1.05 + 1.10 + 1.15) + (time - 30) * 1.2
    */

    totalCost += if (time >= 0 && time < 10) {
        time * 1.05
    }
    else if (time >= 10 && time < 20) {
        10 * 1.05 + (time - 10) * 1.10
    }
    else if (time >= 20 && time < 50)
        10 * (1.05 + 1.10) + (time - 20) * 1.15
    else
        10 * (1.05 + 1.10 + 1.15) + (time - 30) * 1.2

    println("Total Cost: ${totalCost + fixedCost}")
}