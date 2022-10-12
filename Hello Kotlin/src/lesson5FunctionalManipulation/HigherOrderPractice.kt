package lesson5FunctionalManipulation

fun List<Int>.returnDivisibleBy(list: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (list(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)
    println(numbers.returnDivisibleBy { it % 3 })
}