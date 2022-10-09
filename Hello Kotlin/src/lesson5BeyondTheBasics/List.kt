package lesson5BeyondTheBasics

fun main(args: Array<String>) {
    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("red spots")

    println(symptoms.subList(4, symptoms.size))

    listOf(1, 5, 3).sum()
    listOf("a", "b", "cc").sumBy { it.length }
}