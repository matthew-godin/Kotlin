package com.rsk

fun main() {
    val name = "Kevin"
    val name2 = "Terry"

    if (name.isType(name2)) {
        println("$name is the same type as $name2")
    }
}

// there's also the 'noinline' and 'crossinline' keywords

inline fun <reified T> T.isType (value: Any) = value is T