package ru.clevertec.lesson27

class DSLBuilder {
    static MailSpecification mail(@DelegatesTo(MailSpecification) Closure closure) {
        MailSpecification mailSpecification = new MailSpecification()
//        closure.delegate = mailSpecification
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()
        mailSpecification.with closure
        mailSpecification
    }
}
