package ru.clevertec.lesson5

import groovy.transform.CompileStatic

//import java.sql.Date
import java.sql.Date as SqlDate

class VariablesRunner {
//    @CompileStatic
    static void main(String[] args) {
        Integer value = 5
        def value4 = 5
        BigInteger value2 = 36G
        BigDecimal value3 = 3.14G
        new SqlDate()
    }
}
