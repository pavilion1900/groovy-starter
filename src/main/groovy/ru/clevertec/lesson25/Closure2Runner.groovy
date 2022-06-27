package ru.clevertec.lesson25

import ru.clevertec.lesson17.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
            name = "Sveta"
        }
        println closure.thisObject
        println closure.owner
        println closure.delegate

        Student student = new Student("Ivan", "Ivanov", 29)
        println student

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()
        student.with closure
        println student

//        student.getInfo().call()
        student.getInfo()()
    }
}
