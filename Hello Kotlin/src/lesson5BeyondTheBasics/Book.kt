package lesson5BeyondTheBasics

import kotlin.random.Random

const val MAX_NUM_BOOKS_BORROW = 10

class Book(
    val title: String,
    val author: String,
    val year: Int,
    var pages: Int
) {
    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(booksBorrowed: Int): Boolean {
        return booksBorrowed >= MAX_NUM_BOOKS_BORROW
    }

    fun printURL() {
        println("$BASE_URL$title.html")
    }

    companion object {
        const val BASE_URL = "www.book_base/"
    }
}


//object BookConstants {
//    const val BASE_URL = "www.book_base/"
//}

fun Book.returnWeight(): Double {
    return this.pages * 1.5
}

fun Book.tornPages(tornPages: Int) {
    this.pages-= tornPages
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(10))
    }
}

fun main(args: Array<String>) {
    val book = Book("Harry Potter", "JK Rowling", 2007, 300)
    println("Here is your book ${book.title} written by ${book.author} in ${book.year}")

    val puppy = Puppy()
    var counter = 0
    do {
        puppy.playWithBook(book)
        println("Counter: ${counter++}")
    } while(book.pages > 0)
}

