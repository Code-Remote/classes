package com.code_remote.classes.class1

fun main(args: Array<String>){

    println("Hello World")

    println("Why is it not working without paranthesis")

    val word = "I'm just a word" //String
    val number = 1

    println("Using $number variable in a sentence like, $word")

    //number = 3

    var changableWord = "I was a word"
    println(changableWord)
    changableWord = "Now i'm something else"
    println(changableWord)
}