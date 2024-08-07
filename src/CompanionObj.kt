
class Book private constructor(val id:Int,val name:String){

    companion object BookFactory {
        fun create() : Book = Book(0,"animal farm")
    }
}

fun main() {
    val book1 = Book.create()

    println("${book1.id} ${book1.name}")
}