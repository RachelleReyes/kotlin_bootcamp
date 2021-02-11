package lesson2KotlinBasics

import kotlin.math.ceil

    /* ============================================================================================
    * Practice Time: Basic Operations
    * Solve the following using the operator methods in one line of code.
    * If you start with 2 fish, and they breed twice, producing 71 offspring
    * the first time, and 233 offspring the second time, and then 13 fish are
    * swallowed by a hungry moray eel, how many fish do you have left?
    * How many aquariums do you need if you can put 30 fish per aquarium?
    * */
    fun basicOperations() { // Answer: number of aquariums
        println(ceil((2.0).plus(71).plus(233).minus(13).div(30)).toInt())
    }

    // Solution: 2.plus(71).plus(233).minus(13).div(30).plus(1)
    // Bonus question: If you've noticed, all fish numbers above are prime.

    /* ============================================================================================
    * Practice Time: Variables
    * Create a String variable rainbowColor, set its color value, then change it.
    * Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
    * */

    fun variables(){
        var rainbowColor: String = "red"
        rainbowColor = "orange"
        val blackColor: String = "black"
        // blackColor = "not Black"
        println("Rainbow Color: $rainbowColor, Black Color: $blackColor")
    }

    /*
    * Solution
     *  var rainbowColor = "red"
     *  rainbowColor = "blue"
     *  val blackColor = "black"
     *  blackColor = "white" // Error
    * */

/* ============================================================================================
* Practice Time: Nullability
* Try to set rainbowColor to null.
* Declare two variables, greenColor and blueColor.
* Use two different ways of setting them to null.
* */
fun nullability(){
    var rainbowColor: String?= null
    var greenColor = null
    var blueColor: String? = null
}

/* Solution
* var greenColor = null
* var blueColor: Int? = null
* */

/* ============================================================================================
*  Practice Time: Nullability/Lists
* Create a list with two elements that are null; do it in two different ways.
* Next, create a list where the list is null.
* */

fun nullabilityLists(){
    var firstList: List<Int?> = listOf(null, null)
    var secondList: List<Int>? = null
}
/*
* Solution
* listOf(null,null)
* [null, null]
* var list: List<Int?> = listOf(null, null)
* var list2:List<Int>? = null
* */

/* ============================================================================================
*  Practice Time: Null Checks
* Create a nullable integer variable called nullTest, and set it to null.
* Use a null-check that increases the value by one if it's not null, otherwise returns 0,
*  and prints the result.
* Hint: Use the Elvis operator.
* */

fun nullChecks(){
    var nullTest: Int? = null
    println(nullTest?.inc()?:0)
}

/*
* Solution
* println(nullTest?.inc()?:0)
* */

fun main(args: Array<String>){
    basicOperations()
    variables()
    nullability()
    nullabilityLists()
    nullChecks()
}

