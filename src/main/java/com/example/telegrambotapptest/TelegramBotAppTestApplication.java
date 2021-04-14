package com.example.telegrambotapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

@SpringBootApplication
public class TelegramBotAppTestApplication {

    public static void main(String[] args) throws TelegramApiRequestException {
        SpringApplication.run(TelegramBotAppTestApplication.class, args);
    }

}
