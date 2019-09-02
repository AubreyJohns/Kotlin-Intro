package BeyondBasics

const val bookLimit= 5

class Book{
    /*
    var details = "Rich Dad Poor Dad" to "Robert Kiyosaki" to "2004"
    var title = details.first.first
    var author = details.first.second
    var year = details.second

    */
    companion object{
        val BASE_URL= "book"
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
        return ("Rich Dad Poor Dad" to "Robert Kiyosaki")
    }
    fun titleAuthorYear(): Triple<String, String, Int>{
        var details = Triple ("Rich Dad Poor Dad", "Robert Kiyosaki", 2004)
        return details
    }
}

object Constants{
    val BASE_URL = "book"
}

fun main (){
    var book = Book()
    var (title, author, year) = book.titleAuthorYear()
    println("Here is your book $title written by $author in $year.")
    println(book.canBorrow(4))
    book.printUrl("Hamlet")
}