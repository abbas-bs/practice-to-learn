fun main() {
    var objChild = Child()
    objChild.method1()
    objChild.method2()
    println(objChild.name)

    val objParent = Parent()
    println(objParent.name)
}

open class Parent{
    init {
        println("Parent class constructor is called")
    }

    open var name: String = "Asking name from Parent class."

    fun method1(){
        println("I am in Parent class")
    }

}

class Child : Parent(){
    init {
        println("Child class constructor is called")
    }

    override var name: String = "Asking name from Child class via overriding."

    fun method2(){
        println("I am in Child class")
    }
}