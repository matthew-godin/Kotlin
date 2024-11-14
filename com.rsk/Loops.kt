package com.rsk

fun main() {
    // multi-level exit in Kotlin
    var i = 0
    outer@ while (i < 5) {
        var j = 0
        while (j < 5) {
            println("i: $i")
            println("j: $j")
            if (i == 3 && j == 3) {
                break@outer
            }
            ++j
        }
        ++i
    }

    var numbers = 1..10
    var characters = 'a'..'z'

    for (i in 1..10) {
        println(i)
    }
    for (i in 10 downTo 1) {
        println(i)
    }
    for (i in 1..10 step 2) {
        println(i)
    }
    for (i in 1 until 10) {
        println(i)
    }
    for ((i, v) in numbers.withIndex()) {
        println("$v at $i")
    }

    // constant because never changing reference
    val people = HashMap<String, Int>()

    people["Sam"] = 31
    people["Bob"] = 42

    for ((name, age) in people) {
        println("$name is $age")
    }
}