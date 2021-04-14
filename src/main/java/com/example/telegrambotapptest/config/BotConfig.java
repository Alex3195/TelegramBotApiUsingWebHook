package com.example.telegrambotapptest.config;

import com.example.telegrambotapptest.bot.MyBot;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;

@Data
@Configuration
@ConfigurationProperties(prefix = "telegram.bot")
public class BotConfig {
    private String token;
    private String webHook;
    private String name;

    @Bean
    public MyBot MyBot() {
        DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);
        MyBot myBot = new MyBot();
        myBot.setName(name);
        myBot.setToken(token);
        myBot.setWebHook(webHook);
        return myBot;
    }
}
