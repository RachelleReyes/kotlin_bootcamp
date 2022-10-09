package lesson4Classes.aquarium

class SimpleSpice() {
    val name: String = "curry"
    private val spiciness: String = "mild"

    val heat: Int
        get() =
            when(spiciness) {
                "mild" -> 5
                "very spicy" -> 10
                else -> 1
            }

}

fun main(args: Array<String>) {
    val simpleSpice = SimpleSpice()

    println("Name: ${simpleSpice.name} Heat: ${simpleSpice.heat}")
}