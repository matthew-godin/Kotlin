package com.rsk

fun main() {
    val name: String

    // not allowed in Kotlin
    // name = null
    name = "George"

    val name2: String?

    name2 = null

    val name3: String = name2 ?: name

    println(name3)
}