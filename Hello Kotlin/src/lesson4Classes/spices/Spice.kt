package lesson4Classes.spices

sealed abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor):
    SpiceColor by color {
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

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor):
    Spice(name, spiciness, color), Grinder  {
    override fun prepareSpice() {
       println("Prepare Spice")
    }

    override fun grind() {
        println("Grind")
    }
}
interface Grinder {
    fun grind()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF),  YELLOW(0xFFFF00);
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color = Color.YELLOW
}

fun main(args: Array<String>) {
    val curry = Curry("curry", "mild", YellowSpiceColor)
    println("Curry color: ${curry.color}")
}
