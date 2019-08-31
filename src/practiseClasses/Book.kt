package practiseClasses

open class Book(var title: String, var author: String){
    init {
        println("Title: $title \n Author: $author \n")
    }
    var currentPage = 0

    open fun readPage(){
        println(currentPage.inc())
    }
}

class EBook(var format: String = "text"): Book("CashFlow Quadrant", "Robert Kiyosaki"){
    var wordCount = 0
    override fun readPage(){
        wordCount += 250
        println(wordCount)
    }
}

fun main (args: Array<String>){
    var book = Book("Rich Dad Poor Dad", "Robert Kiyosaki")
    var ebook = EBook()
    println(book.currentPage)
    book.readPage()
    println(ebook.wordCount)
    ebook.readPage()
    println(ebook.title)
}