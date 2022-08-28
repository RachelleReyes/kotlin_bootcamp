package lesson2KotlinBasicsB

fun main(){
    basicPractice()
    challengingPractice()
}

/**
 * Basic example
 * Create an integer array of numbers called numbers, from 11 to 15.
 * Create an empty mutable list for Strings.
 * Write a for loop that loops over the array and adds the string representation of
 * each number to the list.
 * */
fun basicPractice(){
    val numbers = intArrayOf(11, 12, 13, 14, 15)
    val list = mutableListOf<String>()

    for(element in numbers) {
        list.add(
            when(element) {
                11 -> "eleven"
                12 -> "twelve"
                13 -> "thirteen"
                14 -> "fourteen"
                15 -> "fifteen"
                else -> "null"
            }
        )
    }
    println(list)
}

/**
 * Challenge example
 * How can you use a for loop to create (a list of) the numbers between
 * 0 and 100 that are divisible by 7?
 * */
fun challengingPractice(){
    val listDivisibleBy7 = mutableListOf<Int>()

    for(i in 0 until 100) {
        if (i % 7 == 0) {
            listDivisibleBy7.add(i)
        }
    }
}