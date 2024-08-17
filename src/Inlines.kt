fun main() {
    calculateTime {
        loop(100000)
    }
}

//using lambda increases overhead, create class and instance at run time by compiler
//inline overcome this issue and copy and paste code at run time from where called
//better understanding by keeping eye on bytecode

inline fun calculateTime(fn: ()->Unit)
{
    val start: Long = System.currentTimeMillis()
    fn()
    val end: Long = System.currentTimeMillis()
    println("Time taken to run function is ${end-start} ms")
}

fun loop(n: Long)
{
     for (i: Long in 1..n){
         //
     }
}