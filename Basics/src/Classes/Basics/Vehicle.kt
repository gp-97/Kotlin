import java.util.Scanner
class Vehicle(val make: String, val year: Int) {
	fun printMake() {
		println("Make: $make")
	}
	fun printYear() {
		println("Year: $year")
	}
}

fun main() {
	val sc = Scanner(System.`in`)
	val hatch = sc.next()
	val sports = sc.next()
	val hatchback = Vehicle(hatch, 2000)
	val sportsCar = Vehicle(sports, 2020)

	hatchback.printMake()
	hatchback.printYear()

	sportsCar.printMake()
	sportsCar.printYear()
}