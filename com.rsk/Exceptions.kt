package com.rsk

fun main() {
    // Runtime exception
    val nums = arrayOf(5)
    try {
        val num = nums[1]
    } catch (t: Throwable) {
        println(t.message)
    } finally {
        println("finally")
    }
    // Application exception
    try {
        throwException()
    } catch (t: Throwable) {
        println(t.message)
    } finally {
        println("finally")
    }

    val num = try {
        nums[1]
    } catch (t: Throwable) {
        0
    }
    println(num)
}

fun throwException() {
    throw Exception("My exception")
}