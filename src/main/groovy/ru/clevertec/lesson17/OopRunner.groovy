package ru.clevertec.lesson17

class OopRunner {
    static void main(String[] args) {
//        Student student = new Student()
//        student.name = "Ivan"
//        println student.name
//        println student["name"]
//        println student.@name

        Student student2 = new Student([name: "Petr", surname: "Petrov", age: 25])
        println student2

        Student student3 = [name: "Max", surname: "Black", age: 34]
        println student3

        def (name, surname) = student3
        println name
        println surname

        List<String> listNames = [student2, student3].collect { it.name }
        println listNames
        List<String> listNames2 = [student2, student3]*.name
        println listNames2
    }
}
