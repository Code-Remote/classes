package com.code_remote.classes.class1

fun main(args: Array<String>){

    println("Hello World")

    val word = "I'm just a word, or a string of characters" //String

    val explicitTyped: String = "the program is too smart"

    println(explicitTyped)


    val number = 1 //Integer

    println("Using $number variable in a sentence like, $word")

    //number = 3

    var changableWord = "I was a specific string of characters"

    println(changableWord)

    changableWord = "Now i'm a different string of characters"

    println(changableWord)
}