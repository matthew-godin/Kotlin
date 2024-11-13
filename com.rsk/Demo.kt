package com.rsk

var num: Int = 3
val total = 45

fun main(args: Array<String>) {
    for (a in args) {
        println(a)
    }
    println()
    println(sum(32, 24))
    println(sum2(1, 1))
    println(num)
    println(total)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b