package com.code_remote.classes.class1

/**
 * A Class is a noun; Player, User, Car, House. You could see it as a blueprint. (starting with a Capital letter ;)
 * The Android framework has loads of them pre-made for you
 * */
class SimpleStaticQuoate(){
    val text = "Is being the same is not the same as being static?"
    val author = "Evert"
}

class Quote(val text: String, val author: String = "Unknown"){

    fun displayBeutifulQuoate(){
        println("\"$text\" - $author")
    }
}

fun main(args: Array<String>) {

    val simpoleQuoateObject = SimpleStaticQuoate()

    val myFirsQuote = Quote("Love is a verb. Love — the feeling — is a fruit of love, the verb.")

    println(myFirsQuote)

    println(myFirsQuote.displayBeutifulQuoate())
}
