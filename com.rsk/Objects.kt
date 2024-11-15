package com.rsk

// singleton
object Logger {
    fun debug(message: String) {
        println(" ** debug $message")
    }
}

class Invoice {
    companion object Logger {
        fun info(message: String) {
            println(" ** info $message")
        }
    }
}

fun main() {
    // object
    val simple = object {
        val name = "Kevin"

        fun printName() {
            println(name)
        }
    }

    simple.printName()

    Logger.debug("my message")

    Invoice.info("second message")
}