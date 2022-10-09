package lesson5BeyondTheBasics

fun main(args: Array<String>) {
    val allBooks = setOf("Hamlet", "Romeo and Juliet", "Macbeth")
    val library = mapOf("Shakespeare" to allBooks)

    println("Hamlet available: ${library["Shakespeare"]?.any { it.contains("Hamlet") }}")


    val moreBooks = mutableMapOf(("JK Rowling" to "Harry Potter 1"))
    moreBooks.getOrPut("Author 2") { "Book 2" }
    moreBooks.getOrPut("Author 3") { "Book 3" }
    println(moreBooks)

}