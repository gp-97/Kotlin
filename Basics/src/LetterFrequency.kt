fun main() {
    val inp = readLine()!!

    val map = mutableMapOf<Char, Int>()

    for (ch in inp) {
        if (!map.containsKey(ch))
            map.put(ch, 1)
        else
            map.put(ch, map[ch]!! + 1)
    }

    map.forEach {ch, freq -> println("$ch -> $freq")}

}