package com.rsk

interface Process {
    fun execute(value: Int)
}

fun main() {
    fibonacci(8)
    fibonacci2(8, object : Process {
        override fun execute(value: Int) {
            println(value)
        }
    })
    //fibonacci3(8, {n -> println(n)})
    //fibonacci3(8, {println(it)})
    fibonacci3(8) {println(it)}
}

// strategy pattern using higher order function 
fun fibonacci3(limit: Int, action: (Int) -> Unit) {
    var prev = 0
    var prevPrev = 0
    var current = 1
     
     for (i in 1..limit) {
        action(current)
        var temp = current
        prevPrev = prev
        prev = temp
        current = prev + prevPrev
     }
}

// strategy pattern using interface
fun fibonacci2(limit: Int, process: Process) {
    var prev = 0
    var prevPrev = 0
    var current = 1
     
     for (i in 1..limit) {
        process.execute(current)
        var temp = current
        prevPrev = prev
        prev = temp
        current = prev + prevPrev
     }
}

fun fibonacci(limit: Int) {
    var prev = 0
    var prevPrev = 0
    var current = 1
     
     for (i in 1..limit) {
        println(current)
        var temp = current
        prevPrev = prev
        prev = temp
        current = prev + prevPrev
     }
}
