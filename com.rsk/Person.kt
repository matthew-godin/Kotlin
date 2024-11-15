package com.rsk

data class Person(val name: String, val age: Int)

fun main() {
    val sam = Person("Sam", 31)
    println("$sam")
}
