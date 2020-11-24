fun main() {
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach {key, value -> println("$key -> $value")}
    println()
    val mutMap = mutableMapOf(1 to "a",  2 to "b", 3 to "c")
    mutMap.put(4, "c")
    mutMap.forEach {key, value -> println("$key -> $value")}

}