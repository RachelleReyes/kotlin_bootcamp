package lesson2KotlinBasicsB

fun main(){
    practice1()
    practice2()
}

/**
 * Practice Time
 * Create three String variables for trout, haddock, and snapper.
 * Use a String template to print whether you do or don't like to eat these kinds of fish.
 */
fun practice1(){
    val trout = "trout"
    val haddock = "haddock"
    val snapper = "snapper"

    val template = "I don't like to eat $trout, $haddock nor $snapper"
    println(template)
}

/**
 * Practice Time
when statements in Kotlin are like case or switch statements in other languages.

Create a when statement with three comparisons:

If the length of the fishName is 0, print an error message.
If the length is in the range of 3...12, print "Good fish name".
If it's anything else, print "OK fish name".
 */
fun practice2(){
    val fishName = " trout"
    printMessage(fishName)
}

fun printMessage(fishName: String){
    when(fishName.length) {
        0 -> println("Error")
        in 3 ..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}