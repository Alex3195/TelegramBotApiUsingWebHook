package com.example.telegrambotapptest.handler;

import com.example.telegrambotapptest.handler.impl.MyHandler;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
@Service
public class MessageHandler implements MyHandler<Message> {
    @Override
    public void handle(Message message) {

    }
}
