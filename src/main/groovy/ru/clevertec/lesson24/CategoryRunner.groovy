package ru.clevertec.lesson24

import ru.clevertec.lesson17.Student

class CategoryRunner {
    static void main(String[] args) {
        Student student = new Student([age: 18, name: "Ivan"])
        use(DefaultStudentMethods.class) {
            student.testStr()
        }
//        student.testStr()
    }
}
