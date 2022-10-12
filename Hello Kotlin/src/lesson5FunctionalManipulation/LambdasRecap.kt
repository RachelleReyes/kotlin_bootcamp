package lesson5FunctionalManipulation

fun main(args: Array<String>){
    val waterFilter = {dirty: Int -> dirty/2}
    waterFilter(30)

    val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))
    myFish.filter { it.name.contains("i")}.joinToString(" "){it.name}
}

data class Fish (val name: String)

