package lesson3FunctionsB

import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")
    feedTheFish()
}

// It's best practice to leave the arguments with default at the end
fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun getDirtySensorReading() = 20

fun makeNewAquarium() = println("Building a new aquarium......")

// Expensive operation to put a function as the default value
fun aquariumStatusReport(aquarium: Any = makeNewAquarium()) {

}

// We can omit the return values since they infer it
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty : Int)  = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater2(
    temperature: Int = 22,
    dirty: Int = 20,
    day: String
) {

}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

//    swim(50, speed="slow")

    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty =50)
    shouldChangeWater2(day="Monday")

    if(shouldChangeWater(day)) {
        println("Change the water today")
    }

}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food ="fasting"
    return when(day){
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}