import java.time.LocalDateTime

fun main(args: Array<String>) {
    //val env: Envelope<Person> = Envelope(Person(), null)
    val env: Envelope<List<Person>> = Envelope(listOf(Person(), Person()), null)
}

class Envelope<T>(val result: T?, val message: String?) where T:List<Any?> {
    val timeGenerated: LocalDateTime

    init {
        timeGenerated = LocalDateTime.now()
    }
}

class Person