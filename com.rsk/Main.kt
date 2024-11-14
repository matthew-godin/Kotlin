package com.rsk

fun main() {
    println("Started ...")

    // no 'new' keyword in Kotlin
    val earth = HabitablePlanet("Earth", false, Score(45))
    //println("planet is ${earth.name}")
    println(earth.nameFormatted)
    println(earth.myMethod())
}