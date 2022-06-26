package ru.clevertec.lesson17

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.util.logging.Slf4j

//@ToString
//@TupleConstructor
//@EqualsAndHashCode
@Canonical
//@Immutable
@Builder
//@Slf4j
class Student implements WithId {
    String name
    String surname
    Integer age

    def getAt(Integer index) {
        index == 0 ? name : surname
    }
}
