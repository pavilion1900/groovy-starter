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

    def methodMissing(String name2, Object arguments) {
        println "missing method $name2 is invoked $arguments"
        def field = name2 - "findBy"
//        println "select * from Student where $field = ${arguments[0]}"
    }

    def propertyMissing(String name2) {
        println "missing property $name2"
        "default value"
    }

    def getInfo() {
        Closure closure = {
            println thisObject
            println owner
            println delegate
            Closure second = {
                println thisObject
                println owner
                println delegate
            }
            second()
        }
        closure
    }
}
