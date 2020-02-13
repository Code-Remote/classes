package com.code_remote.classes.class1

fun main(args: Array<String>) {

    val word: String = "what ever"
    val numberDecimal: Double = 5432.09

    println("Enter a number?")
    var number = readLine()!!.toInt()

    if (number > numberDecimal) {
        println("You entered a Higher number")
    } else if (number < 100) {
        println("You entered a Lower then 100 number")
    } else {
        println("Probably between $numberDecimal and 100")
    }

    when {
        number > numberDecimal -> println("You entered a Higher number")
        number < 100 -> println("You entered a Lower then 100 number")
        else -> println("Probably between $numberDecimal and 100")

    }
    // Operators >= <= || &&

}