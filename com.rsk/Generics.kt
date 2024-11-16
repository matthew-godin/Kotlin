import java.time.LocalDateTime

fun main(args: Array<String>) {
    //val env: Envelope<Person> = Envelope(Person(), null)
    //val env: Envelope<List<Person>> = Envelope(listOf(Person(), Person()), null)
}

class Envelope<T>(val result: T?, val message: String?) where T:List<Any?> {
    val timeGenerated: LocalDateTime

    init {
        timeGenerated = LocalDateTime.now()
    }
}

interface Consumer<in T> {
    fun consume(data: T)
}

fun useConsumer(personConsumer: Consumer<Person>) {
    val studentConsumer: Consumer<Student> = StudentConsumer()
    studentConsumer.consume(Student(1))
    personConsumer.consume(Person(""))
    personConsumer.consume(Student(1))
}

class PersonConsumer : Consumer<Person> {
    override fun consume(data: Person) {

    }
}

class StudentConsumer : Consumer<Student> {
    override fun consume(data: Student) {

    }
}

fun useProducer(producer: Producer<Student>) : Person {
    val personProducer: Producer<Person> = producer
    return producer.next()
}

interface Producer<out T> {
    fun next() : T
}

open class Person(val name: String)

class Student(val studentId: Int) : Person("")