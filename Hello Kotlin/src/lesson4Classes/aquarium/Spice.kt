package lesson4Classes.aquarium

class Spice(var name: String, var spiciness: String = "mild") {
    val heat: Int
        get() =
            when(spiciness) {
                "mild" -> 5
                "very spicy" -> 10
                else -> 1
            }

    init {
        println("Name $name Spiciness $spiciness Heat $heat")
    }
}

fun makeSalt() = Spice("salt", "not spicy")

fun main(args: Array<String>) {
    val listSpices = listOf (
        Spice("spice1", "mild"),
        Spice("spice2", "very spicy"),
        Spice("spice3", "not spicy")
    )

    val spicy = listSpices.filter { it.heat > 5}
    val lessThanSpicy = listSpices.filter { it.heat < 5 }

    println("Spicy: ${spicy.first().name}")
    println("Less tha spicy: ${lessThanSpicy.first().name}")

    makeSalt()
}

