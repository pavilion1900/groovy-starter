package ru.clevertec.lesson24

import ru.clevertec.lesson17.Student

@Category(Student.class)
class DefaultStudentMethods {
    def testStr() {
        println "$nane $surname"
    }
}
