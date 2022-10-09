package lesson5BeyondTheBasics

fun main(args: Array<String>) {
    val testList = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    println(testList.reversed())
}

fun reverseList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 0..list.size-1) {
        result.add(list[list.size - 1])
    }
    return result
}

fun reverseAgain(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size-1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}
