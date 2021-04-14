package com.example.telegrambotapptest.controller;

import com.example.telegrambotapptest.bot.MyBot;
import org.springframework.web.bind.annotation.*;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class WebHookController {
    private final MyBot myBot;

    public WebHookController(MyBot myBot) {
        this.myBot = myBot;
    }

    @PostMapping("/")
    public BotApiMethod<?> onUpdateRecieved(@RequestBody Update update) {
        return myBot.onWebhookUpdateReceived(update);
    }
}
