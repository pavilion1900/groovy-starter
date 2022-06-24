package ru.clevertec.lesson16

import ru.clevertec.lesson10.Person

class IteratesRunner {
    static void main(String[] args) {
        assert [1, 4, 7, 9].any { it % 2 == 0 }
        assert [1, 4, 7, 9].find { it % 2 == 0 } == 4
        assert [1, 4, 7, 9].findAll { it % 2 != 0 } == [1, 7, 9]
        assert (2..4).collect() == [2, 3, 4]

        Person person = new Person(25)
        person.each { println it }
        assert ["asd", "dsf", "12", "546", "234df"].grep(~/\d+/) == ["12", "546"]
        assert ["asd", "dsf", "12", "546", "234df"].grep { it.length() > 4 } == ["234df"]
    }
}
