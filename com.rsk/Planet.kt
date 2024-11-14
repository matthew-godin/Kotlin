package com.rsk

class Planet(val name: String, gaseous: Boolean = false) {
    init {
        println("Created")
    }

    // secondary constructor
    //constructor(name: String, gaseous: Boolean) : this(name)
}