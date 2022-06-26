package ru.clevertec.lesson22

import org.codehaus.groovy.runtime.DefaultGroovyMethods
import ru.clevertec.lesson17.Student

import java.lang.reflect.Method

class MetaClassRunner {
    static void main(String[] args) {
        CustomMetaClass customMetaClass = new CustomMetaClass()
        println "Hello"

        Method method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)

        Student student = new Student()
        Method printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(student, student, "Test 2")

        println student.metaClass

        student.metaClass.abc = "Test property"
        student.metaClass.test = {
            println "It's a new method"
        }
        student.test()
        student.class.metaClass.newMethod = {int value ->
            println "New method in class Student $value"
        }
//        student.newMethod(28)
        new Student().newMethod(28)
        println student.metaClass
    }
}
