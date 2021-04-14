package com.example.telegrambotapptest.bot;

import lombok.Data;

import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Data
public class MyBot extends TelegramWebhookBot {
    private String webHook;
    private String name;
    private String token;
    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        if(update.getMessage()!=null&&update.getMessage().hasText()){
            long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            try {
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText("Hi ".concat(text));
                execute(message);
            }catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String getBotUsername() {
        return name;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    public String getBotPath() {
        return  webHook;
    }
}

