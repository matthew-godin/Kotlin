package com.rsk

// sinlge expression function
fun max(a: Int, b: Int) : Int = if (a > b) a else b

// extension function
fun String.pad(numberToReplace: Int, replacementChar: Char = ' '): String {
    val strToAdd = replacementChar.toString().repeat(numberToReplace)
    return this + strToAdd
}

data class Point(val x: Int, val y: Int) {
    infix fun add(point: Point): Point {
        return Point(this.x + point.x, this.y + point.y)
    }
}

infix fun Int.plus(a: Int): Int {
    return this + a
}

fun main() {
    println(max(4, 3))

    val original = "Kevin"

    val newerString = original.pad(4, '*')

    println(newerString)

    println(Point(4, 5) add Point(3, 3))

    println(4 plus 5)
}