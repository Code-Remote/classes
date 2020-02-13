package com.code_remote.classes.class1

/**
 * A Class is a noun; Player, User, Car, House. You could see it as a blueprint. (starting with a Capital letter ;)
 * The Android framework has loads of them pre-made for you
 * */
class Quote(val text: String, val author: String = "Unknown"){

}

fun main(args: Array<String>) {

    val myFirsQuote = Quote("Love is a verb. Love — the feeling — is a fruit of love, the verb.")

    println(myFirsQuote)
}
