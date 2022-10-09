package lesson5BeyondTheBasics

// Value determined in compile time
const val rocks = 3

val number = 5

const val num = 5

fun complexFunctionCall() {}

val result = complexFunctionCall()

const val CONSTANT = "top-level constant"

object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2

class MyClas {
    companion object {
        const val CONSTANT3 = "constant inside companion object"
    }
}