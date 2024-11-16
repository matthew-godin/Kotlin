package com.rsk

fun main() {
    var i = 0
    //val numbers = Array<Int>(5) { i++ }

    val numbers = listOf(1, 3, 2)

    for (num in numbers) {
        println(num)
    }

    val people = mapOf<Int, String>(1 to "One", 2 to "Two")

    for ((i, v) in people) {
        println("$i -> $v")
    }

    val anyGreaterThan1 = numbers.any { it > 1 }
    // can also use .all

    println(anyGreaterThan1)

    val largerThan1 = numbers.filter { it > 1 }

    for (num in largerThan1) {
        println(num)
    }

    val multipliedBy50 = numbers.map { it * 50 }

    for (num in multipliedBy50) {
        println(num)
    }
}