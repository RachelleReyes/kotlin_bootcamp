package lesson3FunctionsB

import kotlin.random.Random

fun main(args: Array<String>) {
    val rollDice = { numOfSides:Int ->
        if (numOfSides > 0) Random.nextInt(numOfSides) + 1 else 0
    }
    val rollDice2: (Int) -> Int = { numOfSides:Int ->
        if (numOfSides > 0) Random.nextInt(numOfSides) + 1 else 0
    }

    gamePlay { rollDice2(10) }
}

fun gamePlay(rollDice: (Int) -> Int) {
    println(rollDice)
}


