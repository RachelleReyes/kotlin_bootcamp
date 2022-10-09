package lesson4Classes.spices

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

fun main(args: Array<String>) {
    val containers = listOf(
        SpiceContainer(Curry("curry 1","mild")),
        SpiceContainer(Curry("curry 2","spicy")),
        SpiceContainer(Curry("curry 3","not spicy"))
    )

    containers.forEach {
        println(it.label)
    }
}