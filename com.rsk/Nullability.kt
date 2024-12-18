package com.rsk

fun main() {
    val name: String

    // not allowed in Kotlin
    // name = null
    name = "George"

    var name2: String?

    name2 = null

    val name3: String = name2 ?: name

    println(name3)

    val num: Int = 33

    // will get null as Int cannot be cast to String
    // normal 'as' would throw an exception
    name2 = num as? String

    println(name2)

    val num2: Int? = null

    // makes sure can call toString at compilation time
    println(num!!.toString())

    if (name2 != null) {
        println(name2.toString())
    }

    name2?.let {
        println(name2.toString())
    }

    lateinit var address: String

    address = "23232"
    println(address.toString())

    // Java Annotations
    // at top of Utils.kt
    // @file:JvmName("Utils")
    // inside companion object method
    // @JvmStatic
    // to expose a property as a field in the Java space
    // @JvmField
}