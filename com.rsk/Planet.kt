package com.rsk

@JvmInline
value class Score(val score: Int) {
    init {
        if (score < 0 || score > 100) {
            throw IllegalArgumentException()
        }
    }
}

interface Body {
    fun someMethod(message: String)
}

abstract class SpaceBody(val name: String) : Body {
    abstract fun calculateMotion()
}

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

    override fun calculateMotion() {
        TODO("Not yet implemented")
    }

    override fun someMethod(message: String) {
        TODO("Not yet implemented")
    }
}

class HabitablePlanet(name: String, gaseous: Boolean = false, val score: Score) : Planet(name, gaseous) {
    override fun myMethod(): String {
        return super.myMethod() + " and habitable"
    }
}