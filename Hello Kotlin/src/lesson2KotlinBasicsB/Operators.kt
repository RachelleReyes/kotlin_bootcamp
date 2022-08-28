package lesson2KotlinBasicsB

fun main() {
    basicOperations()
    variables()
    nullability()
    nullabilityLists()
    nullChecks()
}

/**
 * Practice Time: Basic Operations
 * Solve the following using the operator methods in one line of code.
 *
 * If you start with 2 fish, and they breed twice, producing 71 offspring the first time, and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel, how many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?

 * Hint: You can chain method calls.
 * Hint: You can call the methods on numbers, and Kotlin will convert them to objects for you.
 * Bonus question: What is special about all the numbers of fish?
 * */
private fun basicOperations(){
    val fishLeft = 71 + 233 - 13
    println("Fish left: $fishLeft")
    val aquariums = (71 + 233 - 13) / 30
    println("Aquariums $aquariums")
}

/**
 * Practice Time: Variables
 * Create a String variable rainbowColor, set its color value, then change it.
 * Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
 * */
private fun variables(){
    var rainbowColor = "black"
    rainbowColor = "pink"

    val blackColor = "black"
//    blackColor = "notBlack" // Test of variables
}

/**
 * Practice Time: Nullability
 * Try to set rainbowColor to null. Declare two variables, greenColor and blueColor.
 * Use two different ways of setting them to null.
 * */

private fun nullability(){
    var rainbowColor = null
    var greenColor: String? = null
    var blueColor = null
}

/**
 * Practice Time: Nullability/Lists
Create a list with two elements that are null; do it in two different ways.
Next, create a list where the list is null.
 */
private fun nullabilityLists(){
    val listTwoElements = listOf(null, null)
    val listTwoElementsB: List<String?> = listOf(null, null)
    val nullList: List<String>? = null
}

/**
 * Practice Time: Null Checks
 * Create a nullable integer variable called nullTest, and set it to null.
 * Use a null-check that increases the value by one if it's not null, otherwise returns 0,
 * and prints the result.
 * */
private fun nullChecks() {
    val nullTest: Int?  = null
    val result = nullTest?.plus(1) ?: 0
    println("Result:  $result")
}

