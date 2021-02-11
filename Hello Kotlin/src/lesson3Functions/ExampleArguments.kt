package lesson3Functions

fun main(args: Array<String>){
    println("Hello ${args[0]}")

    val isUnit = println("This is an expression")
    println(isUnit)

    var temperature = 10
    val isHot = if(temperature > 50) true else false
    println(isHot)

    val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    println(message)
}