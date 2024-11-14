package com.rsk

fun main() {
    println("Started ...")

    // no 'new' keyword in Kotlin
    val earth = Planet("Earth")
    println("planet is ${earth.name}")
}