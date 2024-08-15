fun main() {

    //creating objects for Person class

    val p1 = Person(name = "A", age = 21)
    val p2 = Person(name = "B", age = 17)

    println(p1.canVote())
    println(p2.canVote())

    //creating objects for Abbas class

    var abbi = Abbas("Macroni")
    println(abbi.eatParam)

    //creating objects for Automobile class

    var car = AutoMobile("Civic", true)
    println(car.drive())


}

    //Creating classes below

class Person (val name : String, var age : Int )    //properties
{
        //methods
    fun canVote(): Boolean
    {
        return age>18
    }
}

class Abbas(var eatParam : String)
{
    var likeEating = "$eatParam.Spicy"
}

class AutoMobile(val name : String, val tyres: Int, val maxSeating : Int, hasAirBags: Boolean)
{
    init {
        println("This is AutoMobile Class")
        println("$name car we have.")
    }

        //Secondary Constructor

    constructor(nameParam: String, airBagParam: Boolean):
            this(nameParam, 4, 5, airBagParam)


    val airBags = hasAirBags
    init {
        println("2nd Initializer Block")
    }
    fun drive(){
        println("$name car is driving.")
    }
}