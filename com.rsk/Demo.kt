package com.rsk

var num: Int = 3
val total = 45
val longNumber: Long = 3_000_000_000

fun main(args: Array<String>) {
    for (a in args) {
        println(a)
    }
    println()
    println(sum(32, 24))
    println(sum2(1, 1))
    println(num)
    println(total)
    println(longNumber)
    println(48/23.toDouble())
    val arr2 = intArrayOf(1, 2, 3, 4, 5)
    val arr3 = arrayOf<String>("Bob", "Smith")
    println(arr2[2])
    println("Name is ${arr3[0]} ${arr3[1]}")
    println("Bob".uppercase())
    if (total == 3) {
        println(1)
    } else if (total == 45) {
        println(5)
    } else {
        println(6)
    }
    when (total) {
        3 -> println(1)
        45 -> println(5)
        else -> println(6)
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b