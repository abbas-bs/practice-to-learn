fun main() {

//    var fn = ::sum
//    val lambda1 = {x: Int, y: Int -> x+y}

    println(calculator(4,4, ::sum))
        //OR
    println(calculator(1,2) { a, b -> a + b })
}

fun sum(a: Int, b: Int): Int
{
    return a + b
}

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int): Int
{
    return op(a, b)
}