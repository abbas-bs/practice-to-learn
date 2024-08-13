fun main(){
    println("I am Abbas, learning and praticing Kotlin.")

    //Concept of Variables.

    var score = 100
    score = 90      //var can be reassigned
    println(score)

    val message = "Hello Abbas"
    //message = "Hi buddy!"     //val can't be reassigned
    println(message)

    //Explicit DataTypes Concept

    var name : String = "From now below is output for concept of datatypes"
    var sore : Int = 100
    val pi : Double = 3.14
    var isBoolean : Boolean = true
    var alphabet : Char = 'A'

    //Arithmetic, Logical & Relational Operators has been learnt
    println("From here downward outputs will be shown for arithmatic, relational & logical operators")
    var a = 13
    var b = 2

    println(a+b)            //15
    println(a-b)            //11
    println(a.toFloat()/b)  //6.5
    println(a%b)            //1

    var c = 55

    if(a>b && a>c){
        println("A is greater")
    }else if (b>a && b>c){
        println("B is greater")
    }else{
        println("C is greater")
    }
}