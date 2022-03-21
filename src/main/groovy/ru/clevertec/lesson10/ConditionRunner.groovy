package ru.clevertec.lesson10

class ConditionRunner {
    static void main(String[] args) {
        int x = 10
//        boolean result = x > 10
        if (x) {
            println x
        }

        def person = new Person(19)
        if (person) {
            println person.getId()
        }

        if (person != null) {
            person.getId()
        }

//        person?.getId()
//        person?.getId()?.intdiv()

        def result = x ?: 1
        println result
    }
}
