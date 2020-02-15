package com.code_remote.classes.class1

fun main(args: Array<String>) {

    val simpleList =  listOf(1,2,3)

    println(simpleList)


    val myName = "Evert"
    val yourName = "Doug"
    val myGirlFriend = "Zilla"
    val friendOfMyFriendsName = "Lars"

    val friends = listOf(myName, yourName, myGirlFriend, friendOfMyFriendsName)
    //In Coding we start counting at 0
    println(friends[0])


    val changeableList = mutableListOf(myName, yourName, myGirlFriend, friendOfMyFriendsName)
    changeableList.add("Henk")
    changeableList.remove(myName)
    println(changeableList)


    println(simpleList)

    friends.forEach {
        println(it)
    }

    changeableList.forEachIndexed { index, c ->
        println("get($index: has $c")
    }
}