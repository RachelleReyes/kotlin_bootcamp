package lesson3FunctionsB

import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
    dayOfWeek()
}

/**
 * Basic Task
Create a new Kotlin file.
Copy and paste the main() function from Hello World into the file.
Create a new function, dayOfWeek().
In the body of the function, print "What day is it today?"
Call dayOfWeek() from main().
Run your program.
 */

/**
 * Extended Task
In the body of the dayOfWeek() function, answer the question by printing the current day of the week.

Hints
You can use Java libraries (java.util) from Kotlin. For example, to get the day of the week:
Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
Type in the code, then press Option + Enter in Mac, or Alt + Enter in Windows, over the red Calendar
class to import the library.
Use a when statement to print a string depending on the day. Sunday is the first day of the week.
 */

fun dayOfWeek() {
    println("What day is it today")

    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Sunday is the first day of the week")
        2 -> println("Monday is the second day of the week")
        3 -> println("Tuesday is the third day of the week")
        4 -> println("Wednesday is the fourth day of the week")
        5 -> println("Thursday is the fifth day of the week")
        6 -> println("Friday is the sixth day of the week")
        7 -> println("Saturday is the seventh day of the week")
    }
}