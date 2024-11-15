package com.rsk

import java.time.LocalDate

interface Process {
    fun execute(value: Int)
}

class Meeting {
    var Title: String = ""
    var When: LocalDate = LocalDate.MIN
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main() {
    /*fibonacci(8)
    fibonacci2(8, object : Process {
        override fun execute(value: Int) {
            println(value)
        }
    })*/
    //fibonacci3(8, {n -> println(n)})
    //fibonacci3(8, {println(it)})
    //fibonacci3(8) {println(it)}
    /*fibonacci3(8, ::println)

    var total = 0

    // Kotlin closures, not easily done in Java
    fibonacci3(8) { total += it }

    println(total)*/

    val boardMeeting = Meeting()

    /*boardMeeting.Title = "Board Meeting"
    boardMeeting.When = LocalDate.now()
    boardMeeting.Who.add("Kevin")*/

    // simpler approach using with
    with(boardMeeting) {
        Title = "Board Meeting"
        When = LocalDate.now()
        Who.add("Kevin")
    }

    // simpler approach using apply (difference with 'with' is that it returns the instance)
    boardMeeting.apply {
        Title = "Board Meeting"
        When = LocalDate.now()
        Who.add("Kevin")
    }.create()
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
