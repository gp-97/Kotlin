import java.util.Random
fun fillArray(arr: MutableList<Int>, len: Int, rn: Random) {
    for (i in 1..len)
        arr.add(rn.nextInt(50))
}
fun bubbleSort(arr: MutableList<Int>, len: Int) {
    for (i in arr.indices) {
        for (j in 0 until len - i - 1) {
            if (arr[j] > arr[j+1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}
fun main() {
    val rn = Random()
    val len: Int = rn.nextInt(95) + 5
    val arr = mutableListOf<Int>()
    fillArray(arr, len, rn)
    println(arr.toString())
    bubbleSort(arr, len)
    println(arr.toString())
}
