package ru.clevertec.lesson17

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Student {
    String name
    String surname
    Integer age

    def getAt(Integer index) {
        index == 0 ? name : surname
    }
}
