package com.code_remote.classes.class1

fun main(args: Array<String>) {

    doSomethingFunctional()

    val quote = "He who fears he will suffer, already suffers because he fears."
    val author = "Michel De Montaigne"

    val surface = calculateSurfaceAreaForMe(10,34)



}

fun doSomethingFunctional() {
    println("I just did something functional")
}

fun calculateSurfaceAreaForMe(width: Int, length: Int): Int {
    val surfaceArea = width*length
    println("the surface aread is : $surfaceArea")
    //default value
    //make it nullable
    return surfaceArea
}

fun getAvalueBack(quote:String, author: String) : String {
    return "$quote - $author"
}