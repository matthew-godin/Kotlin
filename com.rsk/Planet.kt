package com.rsk

class Planet(val name: String, gaseous: Boolean = false) {
    init {
        println("Created")
    }

    val nameFormatted = "Planet is $name"

    // secondary constructor
    //constructor(name: String, gaseous: Boolean) : this(name)
}