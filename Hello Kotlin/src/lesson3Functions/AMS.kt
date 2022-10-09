package lesson3Functions

import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}!")
    feedTheFish()

    var bubbles = 0
    while(bubbles <50){
        bubbles++
    }
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20): Boolean{

    fun isTooHot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty >30
    fun isSunday(day: String) = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty)-> true
        isSunday(day) -> true
        else -> false
    }
}

// Expensive
fun makeNewAquarium() = println("Building a new aquariyum....")
fun aquariumStatusReport(aquarium: Any = makeNewAquarium()){

}

/*
fun shouldChangeWater2(
        temperature: Int = 22,
        dirty: Int = 20,
        day: String): Boolean{
    return true
}*/

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater(day = "Monday")

    if(shouldChangeWater(day)){
        println("Change the water today")
    }

    // call dirty processor
    dirtyProcessor()
}

fun randomDay(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String{
    var food = "fasting"
    when(day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
    /*
       return when(day){
            "Monday" -> "flakes"
            "Tuesday" -> "pellets"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Saturday" -> "lettuce"
            "Sunday" -> "plankton"
        }
    * */
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator")
    // everytime filter is called, it creates a new list

    val eager = decorations.filter { it[0] == 'p'}
    println(eager)

    // apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p'}
    println(filtered)
    println(filtered.toList())

    // apply map lazily
    val lazyMap = decorations.asSequence().map {
        println("map: $it")
    }
    println(lazyMap)

}

fun filterSpices() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    // Create a filter that gets all the curries and sorts them by string length.
    val curryList = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(curryList)

    // Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
    val spicesWithCAndE = spices.filter { it.startsWith('c') && it.endsWith('e')}
    println(spicesWithCAndE)

    // Take the first three elements of the list and return the ones that start with 'c'.
    val firstElementsWithC = spices.take(3).filter {it.startsWith('c') }
    println(firstElementsWithC)
}

fun swim() {
    // swim;
    val swim = { println("swim \n")}
}

var dirty = 20
val waterFilter = { dirty: Int -> dirty/2 }

fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    // last paramter call
    dirty = updateDirty(dirty) { dirty ->
        dirty + 50
    }
    dirty = updateDirty(dirty, { dirty ->
        dirty + 50
    })

    // repeat is also a function
}






