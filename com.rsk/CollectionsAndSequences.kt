package com.rsk

fun main() {
    var i = 0
    val numbers = Array<Int>(5) { i++ }

    for (num in numbers) {
        println(num)
    }
}