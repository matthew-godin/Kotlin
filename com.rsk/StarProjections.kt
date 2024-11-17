fun main(args: Array<String>) {
    compareProducers(PersonProducer(), StringProducer())
}

fun compareProducers(prodA: ProducerAndConsumer<*>, prodB: ProducerAndConsumer<*>): Boolean {
    return prodA.size() == prodB.size()
}

interface Producer<out T> {
    fun produce() : T
    fun size() : Int
}

interface Consumer<in T> {
    fun consume(data: T)
}

interface ProducerAndConsumer<T> : Producer<T>, Consumer<T> {

}

class StringProducer : ProducerAndConsumer<String> {
    override fun produce(): String {
        TODO("")
    }

    override fun consume(data: String) {
        TODO("")
    }

    override fun size(): Int {
        TODO("")
    }
}

class PersonProducer : ProducerAndConsumer<Person> {
    override fun produce(): Person {
        TODO("")
    }

    override fun consume(data: Person) {
        TODO("")
    }

    override fun size(): Int {
        TODO("")
    }
}

class Person