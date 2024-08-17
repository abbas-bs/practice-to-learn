fun main() {
    println("Hello ByteShifted".formattedString())
}

fun String.formattedString():String
{
    return "-------------------\n$this\n-------------------"
}