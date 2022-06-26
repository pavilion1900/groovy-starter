package ru.clevertec.lesson19

import groovy.io.FileType

class IORunner {
    static void main(String[] args) {
        File file = new File(".gitignore")
//        println file.text
//        file.each { line -> println line}
//        file.each { println it}
//        file.withInputStream {
//            def allText = new String(it.readAllBytes())
//            println allText
//        }
//        try (FileReader reader = file.newReader()) {
//            // todo
//        }
        File file2 = new File("src/main/resources/text.txt")
        file2.text = "Some new text"
        file2 << "New line" << System.lineSeparator()

//        file2.withOutputStream {}

        File srcDir = new File("src")
//        srcDir.eachDir { println it }
//        srcDir.eachDirRecurse { println it}
        srcDir.eachFile(FileType.FILES){ println it}
    }
}
