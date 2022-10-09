package lesson5BeyondTheBasics

fun main(args: Array<String>) {
    val equipment = "fishnet" to "catching fish"
    println(equipment.first) // fishnet
    println(equipment.second) //catching fish

    val equipment2 = "fishnet" to "catching fish" to "of big size" to "and strong"
    println(equipment2)
    // (((fishnet, catching fish), of big size), and strong)

    val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")
    val fishnet = "fishnet" to "catching fish"

    // Destructuring components, use to return values
    val (tool, use) = fishnet
    println("The $tool is a tool for $use.")
    // The fishnet is a tool for catching fish.

    val fishNetString = fishnet.toString()
    println(fishNetString)
    // (fishnet, catching fish)

    println(fishnet.toList())
    // [fishNet, catching fish]

    fun giveMeATool(): Pair<String, String> {
        return ("fishnet" to "catching")
    }

    val (tool2, use2) = giveMeATool()
    println(tool2)
    // fishnet
    println(use2)
}