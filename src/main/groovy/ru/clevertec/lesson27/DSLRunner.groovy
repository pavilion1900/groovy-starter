package ru.clevertec.lesson27

import static ru.clevertec.lesson27.DSLBuilder.*

//def email = new Email()
//email.setFrom("from@mail.ru")
//email.seTo("to@mail.ru")
//email.seTitle("title")
//
//def body = new EmailBody()
//body.setText("Some text")
//email.seBody(body)

mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images(["image.jpg", "image2.png"])
    }
}