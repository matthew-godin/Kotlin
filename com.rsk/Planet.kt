package com.rsk

class Planet(val name: String, val gaseous: Boolean = false) {
    init {
        println("Created")
    }

    val nameFormatted = "Planet is $name"

    // secondary constructor
    //constructor(name: String, gaseous: Boolean) : this(name)

    private fun myPrivateMethod(): String {
        return "private method"
    }

    fun myMethod(): String {
        return if (gaseous) "$name is gaseous" else "$name is not gaseous"
    }
}