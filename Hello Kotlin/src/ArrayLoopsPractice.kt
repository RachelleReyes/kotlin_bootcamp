/*
*
*   Practice Time
    Looping over arrays and lists is a fundamental technique that has a lot of flexibility in Kotlin.
    * Let's practice.

    * Basic example
    Create an integer array of numbers called numbers, from 11 to 15.
    Create an empty mutable list for Strings.
    Write a for loop that loops over the array and adds the string representation of each number to the list.

    * Challenge example
    How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?
*
* */

class ArrayLoopsPractice{

    fun basicExample(){
        var numbers = intArrayOf(11, 12, 13, 14, 15)
        var stringList: MutableList<String> = mutableListOf()
        var stringRep: String = ""

        for( value in numbers.iterator()){
            when(value){
                11 -> stringRep = "eleven"
                12 -> stringRep = "twelve"
                13 -> stringRep = "thirteen"
                14 -> stringRep = "fourteen"
                15 -> stringRep = "fifteen"
            }
            stringList.add(stringRep)
        }
        println(stringList)
    }

    fun challengeExample(){
        var mutableList: MutableList<Int> = mutableListOf()
        for(i in 0..100 step 7){
            mutableList.add(i)
        }
        println(mutableList)
    }
    /*
    * Solution
    * var list3 : MutableList<Int> = mutableListOf()
    * for (i in 0..100 step 7) list3.add(i)
    * print(list3)
    * [0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98]
    *
    * for (i in 0..100 step 7) println(i.toString() + " - ")
    * */
}

fun main(){
    // Array Loops Practice
    var arrayLoopsPractice = ArrayLoopsPractice()
    arrayLoopsPractice.basicExample()
    arrayLoopsPractice.challengeExample()

}