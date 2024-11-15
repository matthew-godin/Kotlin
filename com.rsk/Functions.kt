package com.rsk

// sinlge expression function
fun max(a: Int, b: Int) : Int = if (a > b) a else b

// extension function
fun String.pad(numberToReplace: Int, replacementChar: Char = ' '): String {
    val strToAdd = replacementChar.toString().repeat(numberToReplace)
    return this + strToAdd
}

fun main() {
    println(max(4, 3))

    val original = "Kevin"

    val newerString = original.pad(4, '*')

    println(newerString)

    println(Point(4, 5) add Point(3, 6))
}