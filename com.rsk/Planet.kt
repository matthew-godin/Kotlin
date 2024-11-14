package com.rsk

open class SpaceBody(val name: String)

open class Planet(name: String, val gaseous: Boolean = false) : SpaceBody(name) {
    init {
        println("Created")
    }

    val nameFormatted = "Planet is $name"

    // secondary constructor
    //constructor(name: String, gaseous: Boolean) : this(name)

    private fun myPrivateMethod(): String {
        return "private method"
    }

    open fun myMethod(): String {
        return if (gaseous) "$name is gaseous" else "$name is not gaseous"
    }
}

class HabitablePlanet(name: String, gaseous: Boolean = false) : Planet(name, gaseous) {
    override fun myMethod(): String {
        return super.myMethod() + " and habitable"
    }
}