package ru.clevertec.lesson23

import ru.clevertec.lesson17.Student

class MissingMethodRunner {
    static void main(String[] args) {
        Student student = new Student()
//        student.test()
        println student.abc

        Map<String, Integer> map = ["1": 11, "2": 22]
        println map["1"]

        student.findByAge(90)
    }
}
