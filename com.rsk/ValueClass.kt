@JvmInline
value class Id(val id: String) {
    init {
        if (id.isEmpty() || !id.matches(Regex("^\\d{3}-[a-zA-Z]{3}\$"))) {
            throw IllegalArgumentException()
        }
    }
}

class Person (id: Id, givenName: String)