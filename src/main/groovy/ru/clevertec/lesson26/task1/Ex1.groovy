package ru.clevertec.lesson26.task1

import ru.clevertec.lesson17.Student

class Ex1 {
    static void main(String[] args) {
        new HashSet<>([1, 2, 3, 4, 4])
        Class.metaClass.make = { Object[] values ->
            println owner
            println thisObject
            println delegate
            delegate.metaClass.invokeConstructor(values)
        }

        HashSet<Integer> hashSet = HashSet.make([1, 2, 3, 4, 4])
        Student student = Student.make("Ivan", "Ivanov", 20)
        Student student2 = Student.make()

        println hashSet
        println student
        println student2
    }
}
