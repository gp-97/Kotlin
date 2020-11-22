fun main(args: Array<String>) {
    val byteNum: Byte = 112
    print("$byteNum: ")
    println(byteNum::class.simpleName)

    val shortNum: Short = 30000
    print("$shortNum: ")
    println(shortNum::class.simpleName)

    val intNum: Int = 1234567890
    print("$intNum: ")
    println(intNum::class.simpleName)

    val longLong: Long = 2343131132452353433
    print("$longLong: ")
    println(longLong::class.simpleName)

    val floatNum: Float = 62354.5234F
    print("$floatNum: ")
    println(floatNum::class.simpleName)

    val doubleNum: Double = 235235.4542
    print("$doubleNum: ")
    println(doubleNum::class.simpleName)

    val charCharacter: Char = 'C'
    print("$charCharacter: ")
    println(charCharacter::class.simpleName)

    val stringString: String = "Kotlin"
    print("$stringString: ")
    println(stringString::class.simpleName)

    val boolBoolean: Boolean = true
    print("$boolBoolean: ")
    println(boolBoolean::class.simpleName)
}