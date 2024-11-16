import java.time.LocalDateTime

fun main(args: Array<String>) {
    val env: Envelope<Person> = Envelope(Person(), null)
}

class Envelope<T>(val result: T?, val message: String?) {
    val timeGenerated: LocalDateTime

    init {
        timeGenerated = LocalDateTime.now()
    }
}

class Person