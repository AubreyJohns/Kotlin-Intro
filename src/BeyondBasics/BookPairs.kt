package BeyondBasics

const val bookLimit= 5

class Book(var title: String, var author: String, var year: Int){
    var pages: Int = 5
    companion object{
        val BASE_URL= "https://book/"
    }
    fun canBorrow(booksBorrowed: Int): Boolean{
        var borrow = true
        borrow = booksBorrowed< bookLimit
        return borrow
    }
    fun printUrl(title: String){
        println("$BASE_URL$title.html")
    }
    fun titleAuthor(): Pair<String, String>{
        return (title to author)
    }
    fun titleAuthorYear(): Triple<String, String, Int>{
        return Triple (title, author, year)
    }
}

fun Book.bookWeight() = this.pages*1.5
fun Book.tornPages(tornPages: Int) = if (pages >= tornPages) pages -= tornPages else pages = 0

object Constants{
    val BASE_URL = "book"
}

class Puppy{
    fun playWithBook(book: Book) = book.tornPages((1..book.pages).random())
}

fun main (){
    var book = Book("Rich Dad Poor Dad", "Robert Kiyosaki", 2004)
    var (title, author, year) = book.titleAuthorYear()
    println("Here is your book $title written by $author in $year.")
    println(book.canBorrow(4))
    book.printUrl("Hamlet")
    var puppy = Puppy()
    while (book.pages>0){
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages in ${book.title}. ")
}