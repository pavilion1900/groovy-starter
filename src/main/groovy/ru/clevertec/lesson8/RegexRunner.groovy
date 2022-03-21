package ru.clevertec.lesson8

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
//        String regex1 = "(\\w+)\\s(\\d+)"
        String regex2 = /(\w+)\s(\d+)/
//        String regex2 = /\w+\s\d+/
//        Pattern pattern = Pattern.compile(regex2)
//        Pattern pattern = ~regex2
//        Matcher matcher = pattern.matcher(value)
        Matcher matcher = value =~ regex2
//        println matcher.matches()
//        println value ==~regex2
        while (matcher.find()){
            println matcher.group()
        }
//        println matcher[0]
//        println matcher[1][2]
//        println matcher[2]
//        println matcher[1..2]

//        matcher.each { group -> println group }
        matcher.each { (group, group1, group2) -> {
            println group
            println group1
            println group2
        } }
    }
}