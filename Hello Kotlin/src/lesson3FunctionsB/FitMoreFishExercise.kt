package lesson3FunctionsB

fun main(args: Array<String>) {
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(tankSize: Double, currentFish:List<Int>, fishSize:Int = 2, hasDecorations: Boolean = true): Boolean {
    val availableSpace: Double = if(hasDecorations) {
        tankSize * .8
    } else {
        tankSize
    }

    val totalLength = currentFish.sum() + fishSize
    return totalLength.toFloat() <= availableSpace
}

/**
 * Expected Output
 * canAddFish(10.0, listOf(3,3,3)) ---> false
 * canAddFish(8.0, listOf(2,2,2), hasDecorations = false) ---> true
 * canAddFish(9.0, listOf(1,1,3), 3) ---> false
 * canAddFish(10.0, listOf(), 7, true) ---> true
 * */


/**
 * Solution
 * fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
    }
 * */