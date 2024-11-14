package com.rsk

enum class Colors {
    RED, GREEN, BLUE
}

fun main() {
    val num = 89

    val isNum6Or7 = when (num) {
        6, 7 -> true
        else -> false
    }

    println(isNum6Or7)

    when (num) {
        in 1..10 -> println("In range")
        else -> println("Not in range")
    }

    val color = Colors.RED

    when (color) {
        Colors.GREEN -> println("Green")
        Colors.RED -> println("Red")
        Colors.BLUE -> println("Blue")
    }
}